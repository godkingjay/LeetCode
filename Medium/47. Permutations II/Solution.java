/*
 This is a classic backtracking problem except that we need to check for duplicates.
 This is solved using two ideas: Hashset and boolean array visited.
 */
class Solution {
    List<List<Integer>> res;
    Set<List<Integer>> set = new HashSet();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backtrack(new ArrayList(), visited, nums);
        res = new ArrayList(set);
        return res;
    }
    private void backtrack(List<Integer> sub,boolean[] visited,int[] nums){
        if(sub.size() == nums.length){
            set.add(new ArrayList(sub));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i] = true;
                sub.add(nums[i]);
                backtrack(sub, visited,nums);
                sub.remove(sub.size()-1);
                visited[i] = false;
            }

        }
    }
}