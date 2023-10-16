### `findMedianSortedArrays` Function Explanation

1. Create an `ArrayList` called `list` to merge both sorted arrays into a single list.
2. Iterate through the elements of `nums1`, and for each element, add it to the `list`.
3. Iterate through the elements of `nums2`, and for each element, add it to the `list`. This effectively combines both input arrays into a single merged list.
4. Create a variable `sum` to store the sum of all elements in the merged list. Initialize it to 0.
5. Iterate through the merged `list`, and for each element, add its value to the `sum`.
6. Calculate the average (mean) of all elements in the merged list by dividing the `sum` by the total number of elements in the list.   
7. Return the calculated average (mean) as the median value of the merged sorted arrays.    