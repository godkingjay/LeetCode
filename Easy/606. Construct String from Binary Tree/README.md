# Problem #606 ([Construct String from Binary Tree](https://leetcode.com/problems/construct-string-from-binary-tree/) | Binary Tree, Depth-First Search, String, Tree)

Given the `root` of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

## Example 1
![image](https://user-images.githubusercontent.com/89616705/188799689-fcafcbca-2df7-49f1-8180-ea19bc33a455.png)
### Input:

    root = [1,2,3,4]
<br/>

### Output:

    "1(2(4))(3)"
<br/>

### Explanation:

    Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary
    empty parenthesis pairs. And it will be "1(2(4))(3)"

## Example 2
![image](https://user-images.githubusercontent.com/89616705/188799923-1c6379b1-cd03-4cac-8f93-4199969dd510.png)

### Input:

    root = [1,2,3,null,4]
<br/>

### Output:

    "1(2()(4))(3)"
<br/>

### Explanation:

    Almost the same as the first example, except we cannot omit the first parenthesis pair
    to break the one-to-one mapping relationship between the input and the output.
