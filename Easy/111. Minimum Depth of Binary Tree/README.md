# LeetCode 111.

## Problem Statement
Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node. Note: A leaf is a node with no children.

### Test Cases

#### Example 1:
- Input: root = [3,9,20,null,null,15,7]
- Output: 2

#### Example 2:
- Input: root = [2,null,3,null,4,null,5,null,6]
- Output: 5

## Solution
To find the minimum depth of a binary tree, we traverse the tree in a recursive manner. We check the depth of the left and right subtrees, and if either of them is zero (indicating an empty subtree), we consider the non-empty one. We return the minimum of the depths of the left and right subtrees plus 1, which represents the minimum depth of the tree.

### Complexity
- Time complexity: O(n), where n is the number of nodes in the binary tree.
- Space complexity: O(h), where h is the height of the binary tree.
