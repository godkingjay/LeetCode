class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%nums.length;
        if(k<0){
        k=k+nums.length;
        }
        int[] temp = new int[n];
         // Copy elements to the temp array with the right shift
         for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        // Copy elements back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
