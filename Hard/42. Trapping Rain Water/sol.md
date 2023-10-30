## Algorithm

### Two pointer approach

1. Initialize two pointers, `left` and `right`, at the beginning and end of the elevation map, respectively.
2. Initialize two variables, `leftMax` and `rightMax`, to 0. These will keep track of the maximum heights on the left and right sides.
3. Initialize a variable `trappedWater` to 0 to keep track of the accumulated trapped water.
4. While `left` is less than `right`, do the following:
   a. If `height[left]` is less than `height[right]`, calculate the trapped water on the left side:
      - If `height[left]` is greater than or equal to `leftMax`, update `leftMax` to `height[left`.
      - Otherwise, add `leftMax - height[left]` to `trappedWater`.
      - Increment `left`.
   b. If `height[right]` is less than or equal to `height[left]`, calculate the trapped water on the right side:
      - If `height[right]` is greater than or equal to `rightMax`, update `rightMax` to `height[right]`.
      - Otherwise, add `rightMax - height[right]` to `trappedWater`.
      - Decrement `right`.
5. Continue this process until `left` is less than `right`.
6. Return the `trappedWater` as the final result.

#### Time Complexity:
The time complexity of the given algorithm is``O(n)`, where n is the number of elements (bars) in the elevation map. This is because the algorithm processes each element once using two pointers, and the while loop iterates through the elements at most once from left to right and right to left. Since each element is processed once, the time complexity is linear with respect to the number of elements.

#### Space Complexity:
The space complexity of the algorithm is `O(1)`, which means it uses a constant amount of extra space. Regardless of the size of the input elevation map, the algorithm only uses a fixed number of variables to keep track of left and right pointers, leftMax, rightMax, and trappedWater. The memory usage does not depend on the size of the input, so the space complexity is constant.