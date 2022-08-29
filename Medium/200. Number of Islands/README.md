# Problem #200 ([Number of Islands](https://leetcode.com/problems/number-of-islands) | Array, Breadth-First Search, Depth-First Search, Matrix, Union Find)

Given an `m x n` 2D binary grid grid which represents a map of `'1's (land)` and `'0's (water)`, *return the number of islands*.

An **island** is surrounded by water and is formed by *connecting adjacent lands horizontally or vertically*. You may assume all four edges of the grid are all surrounded by water.

***

### Example 1
**Input:** `grid = [     ` <br/>
  `["1","1","1","1","0"],` <br/>
  `["1","1","0","1","0"],` <br/>
  `["1","1","0","0","0"],` <br/>
  `["0","0","0","0","0"]]` <br/>
**Output:** `1`

***

### Example 2
**Input:** `grid = [` <br/>
  `["1","1","0","0","0"],` <br/>
  `["1","1","0","0","0"],` <br/>
  `["0","0","1","0","0"],` <br/>
  `["0","0","0","1","1"]]` <br/>
**Output:** `3`

***

### Constraints
- `m == grid.length`
- `n == grid[i].length`
- `1 <= m`, `n <= 300`
- `grid[i][j]` is `'0'` or `'1'`.

## SOLUTIONS

### Depth-First Search

First, create a variable `mat` which copies the original array so as to not overwrite it. Declare a constant array `DIR` which contains indices to be added to the index of the position of the current element in the array to go to its adjacent neighbor:

`DIR = {1, 0, -1, 0, 1}`:
- `{1, 0}` = bottom neighbor
- `{0, -1}` = left neighbor
- `{-1, 0}` = upper neighbor
- `{0, 1}` = right neighbor

- **Code:**
Construct two methods, one that iterates through the elements of the array to check if an element is `'1'`, if so pass its position(index) to another method which marks it as visited(`'0'`) and checks whether adjacent elements are `'1'` or `'0'` and mark it as visited.

- **JAVA**
```java
class Solution {
    char[][] mat;
    int[] DIR = {1, 0, -1, 0, 1};
    public int numIslands(char[][] grid) {
        int n = 0;
        mat = grid;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == '1') {
                    visitIsland(i, j);
                    n++;
                }
            }
        }
        return n;
    }
    
    public void visitIsland(int r, int c){
        if(r < 0 || c < 0 || r >= mat.length || c >= mat[r].length || mat[r][c] == '0') return;
        mat[r][c] = '0';
        for(int i = 0; i < DIR.length - 1; i++){
            visitIsland(r + DIR[i], c + DIR[i + 1]);
        }
    }
}
```
