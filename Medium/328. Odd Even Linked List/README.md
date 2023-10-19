# LeetCode 328. Odd Even Linked List

## Problem Statement
Given the head of a singly linked list, this algorithm groups all the nodes with odd indices together followed by the nodes with even indices and returns the reordered list.
The first node is considered odd, the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.

## Test Cases

### Example 1:
- **Input:** head = [1,2,3,4,5]
- **Output:** [1,3,5,2,4]

### Example 2:
- **Input:** head = [2,1,3,5,6,4,7]
- **Output:** [2,3,6,7,1,5,4]

## Solution
This solution rearranges the linked list by iterating through it and splitting the nodes into two groups: odd and even. It maintains two dummy nodes to represent the start of the even and odd lists. The algorithm traverses the original list and appends each node to its corresponding group (odd or even) based on the node's index. Finally, it connects the odd list to the even list and returns the merged list.

### Complexity
- Time complexity: O(n), where n is the number of nodes in the linked list.
- Space complexity: O(1) since it doesn't use additional data structures except for a few pointers.
