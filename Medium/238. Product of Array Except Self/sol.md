## Solution

The provided solution is implemented in C++ and uses two passes through the `nums` array to calculate the `answer` vector without using division.

1. **Initialization**:
   - Initialize an empty vector `answer`.
   - Initialize two variables `m` and `m1` to 1, which will be used to track the product of non-zero elements and all elements, respectively.
   - Initialize a variable `count` to keep track of the number of zeros in the array.

2. **First Pass**:
   - Iterate through the `nums` array.
   - For each element `nums[i]`, add it to the `answer` vector.
   - Update `m` and `m1` by multiplying them with the current element `nums[i]`.
   - If the current element is 0, increment the `count` variable.

3. **Second Pass**:
   - Iterate through the `nums` array again.
   - For each element at index `i`, calculate the value for `answer[i]` based on the following conditions:
     - If `count` is greater than 1 (meaning there are more than one zero in the array), set `answer[i]` to 0 because the product of all elements would be 0.
     - If `nums[i]` is 0, set `answer[i]` to `m1`. This is because the product of all elements except the zero element is equal to `m1`.
     - Otherwise, set `answer[i]` to the result of dividing `m` by `nums[i`, which effectively gives the product of all elements except the current one.

4. **Return**:
   - Return the `answer` vector, which contains the desired result.

The provided solution correctly handles different cases and satisfies the O(n) time complexity constraint, but it uses O(n) extra space to store the `answer` vector. Achieving O(1) extra space complexity would require a different approach, such as using prefix and suffix products with careful computation.
