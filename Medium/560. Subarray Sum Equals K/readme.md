# Subarray Sum Equals K

## Problem

Given an array of integers `nums` and an integer `k`, the task is to find and return the total number of subarrays whose sum is equal to `k`. A subarray is a contiguous non-empty sequence of elements within the array.

### Example

#### Input

```javascript
const nums = [1, 1, 1];
const k = 2;
console.log(subarraySum(nums, k)); // Output: 2
```

The solution uses a hash table to keep track of cumulative sums. It iterates through the array, updating the cumulative sum and checking if there are subarrays with a sum of (current_sum - k). The count of such subarrays is accumulated, and the hash table is updated with the current cumulative sum.
