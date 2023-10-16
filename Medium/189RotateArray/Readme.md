Problem Statement:

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100] 


Explaination of the approach:

step1: n is assigned the length of the input array nums. This determines the number of elements in the array.

step2: k is taken modulo n to ensure that it is within the range (0, n). This is because if k is larger than n, rotating the array by k positions is equivalent to rotating it by k % n positions.

step3: If k is negative, it is adjusted by adding n to it. This is to handle cases where k is a negative number. Adding n to a negative k effectively rotates the array to the left.

step4: An auxiliary array temp of the same length as nums is created. This array will be used to store the rotated elements.

step5: The loop copies the elements from nums to temp with a right shift of k positions. The modulo operation is used to ensure that the indices wrap around if they exceed the length of the array.

step6: Finally, another loop copies the rotated elements from the temp array back to the original nums array.

Time Complexity:

The code performs two separate loops through the array, each with n iterations. Therefore, the time complexity is O(n).

Space Complexity:

The code uses an additional temp array of the same size as the input array nums. So the space complexity is O(n) as well.
