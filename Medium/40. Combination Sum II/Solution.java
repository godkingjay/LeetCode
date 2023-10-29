import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            int num = candidates[i];
            
            if (num > target) {
                break;
            }
            
            current.add(num);
            backtrack(result, current, candidates, target - num, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
