# Problem #637 ([]() | Binary Tree, Breadth First Search, Depth First Search, Tree)

Given the `root` of a binary tree, return *the average value of the nodes* on each level in the form of an array. Answers within `10`<sup>-5</sup> of the actual answer will be accepted.

## Example 1
![image](https://user-images.githubusercontent.com/89616705/188054900-720e869c-e4ad-446f-86e9-ac251aa1191d.png)

**Input:** 

    root = [3,9,20,null,null,15,7]
<br/>

**Output:**

    [3.00000,14.50000,11.00000]
<br/>

**Explanation:** <br/>

    The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
    Hence return [3, 14.5, 11].

## Example 2
![image](https://user-images.githubusercontent.com/89616705/188056604-9b5c84ee-8230-41ef-9292-3aec863c3977.png)

**Input:**

    root = [3,9,20,15,7]
<br/>

**Output:**

    [3.00000,14.50000,11.00000]

## Constraints
- The number of nodes in the tree is in the range [1, 104].
- -2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1

# Solutions

## Breadth First Search

The idea is to create a `Queue` which stores the nodes in each level of the ***Binary Tree***, *by default `root` node is inserted first*. For each node in a level, the average of the sum is stored inside a `List`.

**The code is structured as such:**

```java
List<Double> list = new ArrayList<Double>();
```
- create a list which will stores ***double*** values that corresponding the average of the values for each level of the ***Binary Tree***.

```java
Queue<TreeNode> q = new LinkedList<>();
q.add(root);
```
- create a ***Queue*** which will store the nodes in a level. Add the `root` *node* to the queue.
