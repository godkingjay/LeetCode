# Problem #1448 ([Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | Binary Tree, Breadth-First Search, Depth-First Search, Tree)

## Problem

Given a binary tree `root`, a *node X* in the tree is named **good** if in the path from *root to X* there are no nodes with a value *greater than X*.

*Return the number of ***good*** nodes in the binary tree.*

<br/>

## Example 1
![image](https://user-images.githubusercontent.com/89616705/187807013-d9e1c227-23c2-48f3-9e81-8c6472aed25b.png)

**Input:**

    root = [3,1,4,3,null,1,5]
<br/>

**Output:**

    4
<br/>

**Explanation:** `Nodes in blue are good.`

    Root Node (3) is always a good node.
    Node 4 -> (3,4) is the maximum value in the path starting from the root.
    Node 5 -> (3,4,5) is the maximum value in the path
    Node 3 -> (3,1,3) is the maximum value in the path.
<br/>

## Example 2
