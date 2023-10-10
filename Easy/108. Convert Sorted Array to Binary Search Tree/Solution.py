class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def sortedArrayToBST(self, nums):
        if not nums:
            return None
        head = self.helper(nums, 0, len(nums) - 1)
        return head

    def helper(self, nums, low, high):
        if low > high:
            return None
        mid = low + (high - low) // 2
        node = TreeNode(nums[mid])
        node.left = self.helper(nums, low, mid - 1)
        node.right = self.helper(nums, mid + 1, high)
        return node

