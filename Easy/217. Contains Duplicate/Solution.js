var containsDuplicate = function (nums) {
    for (let i = nums.length - 1; i >= 0; i--) {
        for (let j = 0; j < i; j++) {
            if (nums[i] === nums[j]) {
                return true;
            }
        }
    }
    return false;
}
