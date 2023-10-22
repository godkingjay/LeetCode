# Kth Largest Element in an Array

## Problem Description

Given an integer array `nums` and an integer `k`, you need to find the kth largest element in the array. Note that it is the kth largest element in the **sorted order**, not necessarily the kth distinct element.

### Example 1:

**Input:**

`nums = [3,2,1,5,6,4], k = 2`

**Output:**

`5`

### Example 2:

**Input:**

`nums = [3,2,3,1,2,4,5,5,6], k = 4`

**Output:**

`4`

### Constraints

- 1 <= k <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

## Approach

The problem can be efficiently solved using a max-heap (PriorityQueue in Java). The idea is to maintain a max-heap of size `k` and keep adding elements from the array. The max-heap will always contain the k largest elements encountered so far.

1. Initialize an empty max-heap (PriorityQueue) with a custom comparator to maintain the largest elements at the top.
2. Iterate through the elements of the input array `nums`.
3. For each element, add it to the max-heap.
4. If the size of the max-heap exceeds `k`, remove the top element to maintain its size as `k`.
5. Continue this process until you have processed all elements in the array.
6. The top element of the max-heap will be the kth largest element in the array.

## Time Complexity

The time complexity of this solution is O(N * log(k)), where N is the number of elements in the input array `nums`. This is because for each element, you perform heap operations which take O(log(k)) time.

## Space Complexity

The space complexity is O(k) since we maintain a max-heap of size `k`.

## Implementation

Here's a sample Java implementation of the approach:

```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        return pq.poll();
    }
}
