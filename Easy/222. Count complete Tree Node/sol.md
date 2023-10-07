### Recursive approach to make the solution more Optimal

1. Initialize an integer variable count to 1. This is because the root node itself should be counted.
2. Check if the root node is null. If the root is null (indicating an empty tree), return 0, as there are no nodes to count.
3. If the root is not null, increment the count variable by recursively counting the nodes in the left subtree of the current root node. This is done by calling the countNodes function on the root.left subtree and adding its result to the count variable.
4. Similarly, increment the count variable by recursively counting the nodes in the right subtree of the current root node. This is done by calling the countNodes function on the root.right subtree and adding its result to the count variable.
5. After traversing both the left and right subtrees and adding their counts, return the final value of count, which represents the total number of nodes in the binary tree.

Example 1:

Input: root = [1,2,3,4,5,6]

Output: 6

Example 2:

Input: root = []

Output: 0

Example 3:

Input: root = [1]

Output: 1