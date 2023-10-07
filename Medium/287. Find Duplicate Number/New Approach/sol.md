### Simplest and Easiest approach to solve

1. Sort the input array `nums` in ascending order.
   
2. Initialize a loop from `i` = 1 to `n` (inclusive), where `n` is the length of the sorted `nums` array.

3. Within the loop:

   a. Check if `nums[i]` is equal to `nums[i-1]`.
   
   b. If the condition is true, return `nums[i]` as it is the duplicate element.
      
4. If no duplicate is found after the loop completes, return -1 to indicate that there are no duplicates in the array.
