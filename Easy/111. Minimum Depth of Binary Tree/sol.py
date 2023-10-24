'''
* LeetCode 111.
* Problem Statement: Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
  Note: A leaf is a node with no children.

* Example 1:
  Input: root = [3,9,20,null,null,15,7]
  Output: 2

* Example 2:
  Input: root = [2,null,3,null,4,null,5,null,6]
  Output: 5
'''

# Solution
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self right = right

# Solution
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0

        left_depth = self.minDepth(root.left)
        right_depth = self.minDepth(root.right)

        # If either the left or right subtree is empty, consider the non-empty one.
        if left_depth == 0 or right_depth == 0:
            return max(left_depth, right_depth) + 1

        return min(left_depth, right_depth) + 1
