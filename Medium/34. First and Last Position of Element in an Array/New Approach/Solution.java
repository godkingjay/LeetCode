public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n=nums.length;
        int arr[] =new int[2];
        int arr1[] =new int[]{-1,-1};
        arr[0] = -1; arr[1] = -1;
        for (int i = 0; i < n; i++) {
            if (target != nums[i])
                continue;
            if (arr[0] == -1)
                arr[0] = i;
            arr[1] = i;
        }
        if (arr[0] != -1) {
            return arr;
            
        }
        else
            return arr1;
    }
    
}
