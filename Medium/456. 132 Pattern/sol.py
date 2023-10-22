'''
 * LeetCode 456.
 * Problem Statement- Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
                      Return true if there is a 132 pattern in nums, otherwise, return false.
 *
 * Test Cases:

  * Example 1:
    Input: nums = [1,2,3,4]
    Output: false
    Explanation: There is no 132 pattern in the sequence.
    
  * Example 2:
    Input: nums = [3,1,4,2]
    Output: true
    Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
    
  * Example 3:
    Input: nums = [-1,3,2,0]
    Output: true
    Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
'''

# Solution
class Solution:
    def find132pattern(self, nums: List[int]) -> bool:
        # Initialize an empty stack and set 'third' to negative infinity.
        stack, third = [], float('-inf')

        # Iterate through the 'nums' list in reverse order.
        for num in reversed(nums):
            # If the current number is smaller than 'third', we found the '132' pattern.
            if num < third:
                return True

            # While the stack is not empty and the top of the stack is smaller than the current number,
            # pop elements from the stack and update 'third' if necessary.
            while stack and stack[-1] < num:
                third = stack.pop()

            # Push the current number onto the stack for potential future comparisons.
            stack.append(num)

        # If no '132' pattern is found after iterating through the entire list, return False.
        return False

