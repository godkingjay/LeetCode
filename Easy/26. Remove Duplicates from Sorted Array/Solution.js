// Solution # 1
const removeDuplicates = function (nums) {
    let uniqueCount = 1; // Initialize the count of unique elements.

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] !== nums[i - 1]) {
            // If the current element is different from the previous element, it's a new unique element.
            nums[uniqueCount] = nums[i]; // Move the unique element to the next position.
            uniqueCount++; // Increment the count of unique elements.
        }
    }

    return uniqueCount;
};

// Solution # 2
const removeDuplicates = function (nums) {
    let k = [...new Set(nums)];
    return k.length;
    // A Set is a built-in JavaScript data structure that only stores unique values, so any duplicates in the nums array are automatically removed when creating the Set.
}
