# PROBLEM #55 [Jump Game](https://leetcode.com/problems/jump-game/description/)
## Problem Statement

You are given an integer array `nums`. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

### Example 1:

**Input:** `nums = [2,3,1,1,4]`  
**Output:** `true`  
**Explanation:** Jump 1 step from index 0 to 1, then 3 steps to the last index.

### Example 2:

**Input:** `nums = [3,2,1,0,4]`  
**Output:** `false`  
**Explanation:** You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

### Constraints:

- `1 <= nums.length <= 10^4`
- `0 <= nums[i] <= 10^5`

## SOLUTIONS
<!-- By Tusharknwl -->
### **Greedy**
#### Approach:

1. Start iterating backwards (right to left) through the array.

2. Initialize a variable `minJump` to 0, representing the minimum jump length required to reach the last index.

3. For each position, increment `minJump` by 1 since you need at least one jump to reach the last index.

4. Check if the maximum jump length at the current position (i.e., `nums[i]`) is greater than or equal to the `minJump` required.

5. If `nums[i] >= minJump`, then it's possible to reach the last index from this position. Set `minJump` to 0 for the next iteration, indicating that from the current position, you can reach the last index with no additional jumps.

6. Continue this process until you've iterated through the entire array.

7. After the loop, check if `minJump` is 0. If it is, this indicates that you can reach the last index from the first index. Return `true`. Otherwise, return `false`.

#### Complexity
- Time complexity: O(N), where N is the number of elements in the array.
- Space complexity: O(1) since no additional space is used.

#### **C++**
```cpp
class Solution {
public:
//checking right to left if the current position can reach the last index
    bool canJump(vector<int>& nums) {
        int minjump=0;
        for(int i=nums.size()-2; i>=0; i--) {
            minjump++;
            if(nums[i]>=minjump) 
                minjump=0;
        }
        return !minjump;  //if minjump is 0, then it is possible to reach the last index.
    }
};
