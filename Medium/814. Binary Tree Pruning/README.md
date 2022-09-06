# Problem #814 ([Binary Tree Pruning](https://leetcode.com/problems/binary-tree-pruning/) | Tree, Depth-First Search, Binary Tree)

Given the `root` of a binary tree, return *the same tree where every subtree (of the given tree)* not containing a `1` *has been removed*.

A subtree of a node `node` is `node` plus every node that is a descendant of `node`.

# Solutions

## 1. Depth-First Search (Recursive)

### Codes

- **Java**
```java
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val== 0) return null;
        return root;
    }
}
```
![image](https://user-images.githubusercontent.com/89616705/188560772-96ad0936-d406-4489-a978-ee85a449757a.png)
<br/>

### Complexity
- **Time:** `O(log n)`
- **Space:** `O(1)`
