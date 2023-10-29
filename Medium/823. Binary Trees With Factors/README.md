<h3>823. Binary Trees With Factors</h3><br>
<strong>Medium</strong><br><br>

Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.

We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children.

Return the number of binary trees we can make. The answer may be too large so return the answer modulo 109 + 7.
<br>

Example 1:<br>
Input: arr = [2,4]<br>
Output: 3<br>
Explanation: We can make these trees: [2], [4], [4, 2, 2]
<br>

Example 2:<br>
Input: arr = [2,4,5,10<br>
Output: 7<br>
Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
<br>

Constraints:<br>
1. <= arr.length <= 1000<br>
2. <= arr[i] <= 109<br>
All the values of arr are unique.
