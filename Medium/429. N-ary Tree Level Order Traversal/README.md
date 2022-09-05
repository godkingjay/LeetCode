# Problem #429 ([N-ary Tree Level Order Traversal](https://leetcode.com/problems/n-ary-tree-level-order-traversal/) | Tree, Breadth-First Search)
![image](https://user-images.githubusercontent.com/89616705/188376789-0f09f050-d1cd-42bf-9461-6e28c920316e.png)

Given an n-ary tree, return the *level order* traversal of its nodes' values.

*Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).*



### Codes
- **Java**
```java
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int n = q.size();
            for(int i = 0; i < n; i++){
                Node curr = q.poll(); 
                level.add(curr.val);
                for(Node node: curr.children){
                    q.add(node);
                }
            }
            res.add(level);
        }
        return res;
    }
}
```
![image](https://user-images.githubusercontent.com/89616705/188382963-319ff10a-4c49-4744-bd8a-5af21c2cf2f3.png)
<br/>

- **C++**
<br/>

- **Python3**

### Complexity
- **Time:** ``
- **Space:** ``
