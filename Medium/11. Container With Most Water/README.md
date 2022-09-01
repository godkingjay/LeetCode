# Problem #11 ([Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Array, Greedy, Two Pointers)

You are given an integer array height of length `n`. There are `n` vertical lines drawn such that the two endpoints of the **i<sup>th</sup>** line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

*Return the maximum amount of water a container can store.*

**Notice** that you may not slant the container.

## Example 1
![image](https://user-images.githubusercontent.com/89616705/187815178-fc833b50-3d87-4e95-a17c-155d0d81a3a8.png)

**Input:**

    height = [1,8,6,2,5,4,8,3,7]
<br/>

**Output:**

    49
<br/>

**Explanation:**
```
The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.
```

## Example 2
**Input:**

    height = [1,1]
<br/>

**Output:**

    1
<br/>

## Constraints
- `n == height.length`
- `2 <= n <= 105`
- `0 <= height[i] <= 104`

# Solutions

## 

### Code

- **JAVA**
```java
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftIdx = 0, rightIdx = height.length-1;
        
        while(leftIdx < rightIdx){
            maxArea = Math.max(maxArea, Math.min(height[leftIdx], height[rightIdx]) * (rightIdx - leftIdx));
            if(height[leftIdx] < height[rightIdx])
                leftIdx++;
            else
                rightIdx--;
        }
        
        return maxArea;
    }
}
```
<br/>

- **C**++
```cpp
class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxArea = 0;
        int leftIdx = 0, rightIdx = height.size() - 1;
        
        while(leftIdx < rightIdx){
            maxArea = max(maxArea, min(height[leftIdx], height[rightIdx]) * (rightIdx - leftIdx));
            if(height[leftIdx] < height[rightIdx])
                leftIdx++;
            else
                rightIdx--;
        }
        
        return maxArea;
    }
};
```

### Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`
