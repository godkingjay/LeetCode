# Distinct Subsequences Problem Explained :sparkles:

## Problem Statement :page_with_curl:

Given two strings, `s` and `t`, find the number of distinct subsequences of `s` that are equal to `t`.

## Approach :bulb:

We'll use dynamic programming to solve this problem. Our goal is to build a 2D table to keep track of the number of distinct subsequences. We'll use modulo arithmetic to avoid overflow.

1. **Initialization** :seedling:
   - We calculate the lengths of strings `s` and `t` and store them as `m` and `n`, respectively.
   - If `m` is less than `n`, there can be no distinct subsequences, so we return 0.

2. **Dynamic Programming Matrix** :chart_with_upwards_trend:
   - We create a 2D matrix `dp` with dimensions `m x n` to store the intermediate results.
   - We initialize `dp[0][0]` based on whether the first characters of `s` and `t` match.

3. **Initialize First Column** :arrow_down:
   - We iterate over the first column of `dp` (i.e., for `j = 0`) and calculate values based on whether `s[i]` and `t[0]` match:
     - If they match, we add 1 to the value from the previous row and take the result modulo `1e9 + 7`.
     - If they don't match, we simply copy the value from the previous row.

4. **Fill the Rest of the Matrix** :arrow_right:
   - We iterate over the rest of the matrix using nested loops for `i` and `j`.
   - For each cell, we check if `s[i]` and `t[j]` match:
     - If they match, we add the values from the previous row and the diagonal and take the result modulo `1e9 + 7`.
     - If they don't match, we copy the value from the previous row.

5. **Final Result** :tada:
   - The final result is stored in `dp[m-1][n-1]`, which represents the number of distinct subsequences.

6. **Return Result** :rocket:
   - We return `dp[m-1][n-1]`, which is the answer to the problem.

## Time Complexity :hourglass:
The time complexity of this solution is O(m * n), where `m` and `n` are the lengths of strings `s` and `t`, respectively.

## Space Complexity :file_folder:
The space complexity is O(m * n) because we use a 2D matrix of the same dimensions to store intermediate results.

## Happy Coding! :computer: :sparkles:
