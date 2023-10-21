public class Solution {
    public boolean jumpPossible(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution jumpGame = new Solution();
        int[] nums1 = {3, 2, 1, 0, 4};
        int[] nums2 = {2, 3, 1, 1, 4};

        boolean result1 = jumpGame.jumpPossible(nums1);
        boolean result2 = jumpGame.jumpPossible(nums2);

        System.out.println("Can reach the last index (nums1): " + result1); // Output: false
        System.out.println("Can reach the last index (nums2): " + result2); // Output: true
    }
}
