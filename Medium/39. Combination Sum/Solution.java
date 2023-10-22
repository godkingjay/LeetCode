/*
    This is a typical backtracking problem where you get all the possible combinations.
    The only difference is that you can pick the same number multiple times. So, instead of passing the current index + 1 to move
    to the next element, you can pass it the current index (j instead of j+1) and move to the next element only if the current one
    leads to sum greater than the target.
*/

class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, new ArrayList(), 0, 0);
        return res;
    }
    private void backtrack(int[] candidates, int target, List<Integer> sub, int sum, int i){
        if(sum==target){
            res.add(new ArrayList(sub));
            return;
        }
        if(sum>target) return;
        for(int j=i;j<candidates.length;j++){
            sub.add(candidates[j]);
            backtrack(candidates,target,sub,sum+candidates[j],j);
            sub.remove(sub.size()-1);
        }
    }
}