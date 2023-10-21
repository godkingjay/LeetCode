class Solution {
    public int jump(int[] nums) {
    for(int i = 1; i < nums.length; i++)
      {
        nums[i] = Math.max(nums[i] + i, nums[i-1]);
      }

      int ind = 0;
      int ans = 0;

      while(ind < nums.length - 1)
      {
        ans++;
        ind = nums[ind];
      }

      return ans;
    }
}
