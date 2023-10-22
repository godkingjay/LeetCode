# Problem Title

Max Dot Product of Two Subsequences

## Problem Description

1. We need to find max dot product possible given two arrays nums1 and nums2.

2. We need to ensure that while finding the dot product, the relative order of the numbers in respective arrays is same.

3. We can achieve this using dynamic programming. This is because, at any point when we find the dot product of two numbers we need to add the maximum dot product till previous element to our current answer. This we do till all elements of both the arrays are accounted for.

## Method to Solve

1. The function maxDotProduct takes two lists, nums1 and nums2, as input and returns an integer, which is the maximum dot product.

2. It initializes n and m as the lengths of nums1 and nums2, respectively.

3. It creates a 2D memoization table memo of size n x m and initializes all its values to negative infinity (indicating that they have not been computed yet).

4. The core of the algorithm is the dp function, which is a recursive function that computes the maximum dot product starting from a specific position (i, j) in the two arrays.

5. The base case of the recursion is when either i reaches n or j reaches m, in which case the dot product cannot be calculated, so it returns negative infinity.

6. If the value at (i, j) in the memoization table is not negative infinity (indicating it has been computed before), the function directly returns that value.

7. Otherwise, it calculates the maximum dot product at position (i, j) by considering three choices:
    * The dot product of nums1[i] and nums2[j] plus the maximum dot product starting from the next positions (i+1, j+1) with a minimum value of 0 (ensuring that negative contributions are not considered).
    * The maximum dot product starting from (i+1, j) without including the current elements from nums1 and nums2.
    * The maximum dot product starting from (i, j+1) without including the current elements from nums1 and nums2.

8. The maximum of these three choices is stored in memo[i][j], and the function returns this value.

9. Finally, the maxDotProduct function is called with an initial position of (0, 0) to start the computation, and it returns the maximum dot product.


