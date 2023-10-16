### Simplest, Easy and Optimized java Solution

Algorithm
1. Initialize a variable zero to 0. This variable will be used to keep track of the number of trailing zeroes.
2. Start a loop with i initialized to 5. The loop will continue as long as i is less than or equal to n.
3. Inside the loop, calculate the number of factors of 5 in n. You can do this by dividing n by i and adding the result to the zero variable. This step accounts for the number of trailing zeroes caused by the multiples of 5 in the factorial of n.
4. Multiply i by 5 in each iteration of the loop to check for the next power of 5.
5. Once the loop is finished, return the value of zero, which represents the number of trailing zeroes in the factorial of n.

Example 1:

Input: n = 3

Output: 0

Explanation: 3! = 6, no trailing zero.

Example 2:

Input: n = 5

Output: 1

Explanation: 5! = 120, one trailing zero.

Example 3:


Input: n = 0

Output: 0