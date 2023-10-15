# LeetCode 456.

## Problem Statement
Given an array of n integers nums, a 132 pattern is a subsequence of three integers
nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
Return true if there is a 132 pattern in nums, otherwise return false.
 
### Test Cases

#### Example 1:
- Input: nums = [1,2,3,4]
- Output: false
- Explanation: There is no 132 pattern in the sequence.
    
#### Example 2:
- Input: nums = [3,1,4,2]
- Output: true
- Explanation: There is a 132 pattern in the sequence: [1, 4, 2].

## Solution
We iterate through the 'nums' list in reverse order. We maintain a stack to keep track of potential '2' candidates.
We also keep track of the '3' candidate as 'third'. If we encounter a number smaller than 'third', we return True as we found a '132' pattern.
If the current number is greater than the top of the stack, it becomes a potential '3' candidate, and we update 'third'.
Finally, we push the current number onto the stack for potential future '2' candidates.

### Complexity
- Time complexity: O(n), where n is the length of the 'nums' list.
- Space complexity: O(n), as the stack can potentially hold all elements of the 'nums' list.
