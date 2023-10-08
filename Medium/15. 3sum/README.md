

## 1. Input Validation:
   - The function `threeSum` takes an integer array `arr` as its input.
   - It first checks if the array is null or if its length is less than 3. If either of these conditions is met, the function returns an empty list because you cannot form triplets with less than 3 elements.

## 2. Sorting:
   - The input array `arr` is sorted in ascending order using `Arrays.sort(arr)`. Sorting is a crucial step in solving the 3Sum problem, as it allows us to efficiently search for triplets.

## 3. Loop Over the Array:
   - The code uses a for loop to iterate through the sorted array `arr` from the beginning to the third-to-last element. The reason for iterating only up to `arr.length - 2` is that we need at least two more elements (one on the left and one on the right) to form a triplet.

## 4. Two-Pointer Approach:
   - Inside the loop, two pointers, `left` and `right`, are initialized. `left` starts just to the right of the current element at index `i`, and `right` starts at the last element of the array.
   - A while loop is used to perform a two-pointer approach to find triplets. It continues as long as `left` is less than `right`.

## 5. Triplet Sum Calculation:
   - Inside the while loop, the sum of the current triplet is calculated as `sum = arr[i] + arr[left] + arr[right]`.

## 6. **Checking for Zero Sum**:
   - If `sum` is equal to zero, it means that a triplet with a zero sum has been found. In this case:
     - The triplet (arr[i], arr[left], arr[right]) is added to the `result` set. A set is used to store unique triplets to avoid duplicates.
     - Both `left` and `right` pointers are moved inward to find other potential triplets.

## 7. Adjusting Pointers:
   - If `sum` is less than zero, it means that the sum is too small, so the `left` pointer is moved to the right (increased).
   - If `sum` is greater than zero, it means that the sum is too large, so the `right` pointer is moved to the left (decreased).

## 8. Returning the Result:
   - Once the loop has finished processing all possible triplets, the function converts the `result` set to a list and returns it. This list contains all unique triplets that sum to zero.


## 9.Time Complexity :
The code's time complexity is O(n^2) due to the nested loops and the sorting step, where "n" is the length of the input array `arr`. The use of a set ensures that duplicate triplets are not included in the result.