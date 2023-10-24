# LeetCode 10. Regular Expression Matching

## Problem Statement
Given an input string `s` and a pattern `p`, this algorithm implements regular expression matching with support for two special characters:
- `.` Matches any single character.
- `*` Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

## Test Cases

### Example 1:
- **Input:** `s = "aa", p = "a"`
- **Output:** `false`
- **Explanation:** "a" does not match the entire string "aa".

### Example 2:
- **Input:** `s = "aa", p = "a*"`
- **Output:** `true`
- **Explanation:** '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

### Example 3:
- **Input:** `s = "ab", p = ".*"`
- **Output:** `true`
- **Explanation:** ".*" means "zero or more (*) of any character (.)".

## Solution
The solution provides two implementations of regular expression matching:

### Dynamic Programming (DP)
The second solution uses dynamic programming to solve the problem. It creates a DP matrix `dp` to keep track of matching characters. It iterates through both the string `s` and pattern `p`, considering various cases, such as matching characters or wildcard '*', and updates the DP matrix accordingly. The final result is stored in `dp[m][n]`, where `m` and `n` are the lengths of strings `s` and `p`, respectively.

## Complexity
- Time complexity for the DP solution: O(m*n), where `m` is the length of string `s` and `n` is the length of pattern `p`.
- Space complexity for the DP solution: O(m*n) due to the DP matrix.

