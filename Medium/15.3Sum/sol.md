# Problem Title

3Sum

## Problem Description

Given an array `nums` of n integers, find all unique triplets in the array that add up to a specific target sum.

Here are some key points to understand about the problem:

1. The goal is to find all unique triplets in the array `nums` such that a + b + c = 0, where a, b, and c are elements of `nums`.
2. The solution set must not contain duplicate triplets.

## Method to Solve

1. Sort the given array `nums` in ascending order.
2. Initialize an empty array `result` to store the triplets.
3. Iterate through the array using a loop variable `i` from 0 to n-2.
    - Skip duplicates: If `i > 0` and `nums[i] == nums[i-1]`, continue to the next iteration.
    - Set `target` as the negation of `nums[i]`.
    - Use two pointers, `left` starting from `i + 1` and `right` starting from `n - 1`.
4. Within the loop, while `left < right`, calculate the sum `sum = nums[i] + nums[left] + nums[right]`.
    - If `sum == 0`, add the triplet `[nums[i], nums[left], nums[right]]` to the `result`.
    - Skip duplicates: Increment `left` while `nums[left] == nums[left + 1]`, and decrement `right` while `nums[right] == nums[right - 1]`.
    - Increment `left` and decrement `right`.
    - If `sum < 0`, increment `left`; otherwise, decrement `right`.
5. Return the `result` array containing all unique triplets.