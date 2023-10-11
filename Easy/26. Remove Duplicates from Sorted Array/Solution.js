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
function removeDuplicates(nums) {
    // Use filter to create a new array with unique elements
    const uniqueArray = nums.filter((value, index) => nums.indexOf(value) === index);

    // Copy the unique elements back to the original array
    for (let i = 0; i < uniqueArray.length; i++) {
        nums[i] = uniqueArray[i];
    }
    return uniqueArray.length;
}
