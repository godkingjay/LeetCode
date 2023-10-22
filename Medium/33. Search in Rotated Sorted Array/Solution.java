class Solution {
    public int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int findRotationPoint(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (nums[mid] < nums[start]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return 0; // If the array is not rotated, return 0 as the rotation point.
    }

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        if (nums[start] < nums[end]) {
            return binarySearch(nums, start, end, target);
        } else {
            int rotationPoint = findRotationPoint(nums);

            int result1 = binarySearch(nums, start, rotationPoint - 1, target);
            if (result1 != -1) {
                return result1;
            }

            int result2 = binarySearch(nums, rotationPoint, end, target);
            return result2;
        }
    }
}
