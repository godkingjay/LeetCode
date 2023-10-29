## Approach

The approach used here is to perform a level-wise traversal of the binary tree while keeping track of the largest value in each level. This is achieved using a queue for level order traversal.

### Initialization
- Begin with initializing an empty queue.
- Add the root node of the binary tree to the queue. This will serve as the starting point for the traversal.

### Level-wise Traversal
- Continue processing nodes while the queue is not empty.
- For each level, calculate the size of the current level (i.e., the number of nodes in that level). This helps in distinguishing between nodes of different levels.

### Capture Maximum
- For each level, initialize a variable `max_val` with the smallest possible integer (INT_MIN). This variable is used to keep track of the maximum value in the current level.
- As we process each node in the current level, we update `max_val` to be the maximum between the node's value and the current `max_val`.

### Child Processing
- After processing a node, add its left and right children (if they exist) to the queue. This ensures that the next level of nodes will be processed in the subsequent iterations.

### Result Update
- Once all nodes of a level are processed, the maximum value for that level (`max_val`) is added to the result list.

### Complexity

- Time complexity: O(n) where n is the number of nodes in the binary tree. Each node is processed once, and the maximum value at each level is determined in constant time. So, the overall time taken is linear with respect to the number of nodes.
- Space complexity: O(n). In the worst case, the queue can hold all leaf nodes. In a balanced binary tree, the last level can have n/2 nodes. Thus, the space complexity is linear.


