# Problem Title

Integer Break

## Problem Description

1. The goal is to find the maximum product that can be obtained for any given positive integer n.

2. Here are some key points to understand about the problem:

    * You must break n into at least two parts, meaning that n itself cannot be one of the parts.
    * The parts into which n is broken must be positive integers, which means they are greater than zero.
    * The problem does not specify how many parts n should be broken into, but you need to determine the number and values of these parts to maximize their product.
    * You need to find an optimal strategy to break n into parts to maximize the product, and this often involves some mathematical analysis and dynamic programming techniques.
    * Solving this problem requires finding an algorithm or approach that determines the best way to break a given integer n into parts and calculates the maximum product efficiently.

## Method to Solve

1. Create an array dp of size n+1 to store the maximum product for each integer from 1 to n.
2. Initialize dp[1] = 1 since the maximum product for 1 is 1.
3. Iterate from i = 2 to n and for each i, iterate from j = 1 to i-1.
4. Calculate dp[i] as the maximum of dp[i], j * (i - j), and j * dp[i - j].
5. The final answer is dp[n].


