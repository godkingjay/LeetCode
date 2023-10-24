'''  
    # LeetCode 10.
    # Problem Statement:
    # Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
    # - '.' Matches any single character.
    # - '*' Matches zero or more of the preceding element.
    # The matching should cover the entire input string (not partial).

    # Test Cases:

    ## Example 1:
    - Input: s = "aa", p = "a"
    - Output: false
    - Explanation: "a" does not match the entire string "aa".

    ## Example 2:
    - Input: s = "aa", p = "a*"
    - Output: true
    - Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

    ## Example 3:
    - Input: s = "ab", p = ".*"
    - Output: true
    - Explanation: ".*" means "zero or more (*) of any character (.)".
'''

# Solution:

# class Solution:
#    def isMatch(self, s: str, p: str) -> bool:
#        return re.match(fr"^{p}$", s) is not None


class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        m, n = len(s), len(p)
        
        # Initialize a dynamic programming table dp, where dp[i][j] represents whether the first i characters of s
        # match the first j characters of p.
        dp = [[False] * (n + 1) for _ in range(m + 1)]
        
        # Base case: An empty pattern matches an empty string.
        dp[0][0] = True
        
        # Handle cases where p[j-1] is '*':
        for j in range(1, n + 1):
            if p[j - 1] == '*':
                # '*' can represent zero occurrences of the preceding element, so dp[0][j] depends on dp[0][j-2].
                dp[0][j] = dp[0][j - 2]
            else:
                # If the preceding element is not '*', dp[0][j] can only be True if p[j-2] is '*'
                # and dp[0][j-2] is also True (matching zero occurrences).
                dp[0][j] = j > 1 and p[j - 2] == '*' and dp[0][j - 2]
        
        # Fill in the dp table for the remaining cases.
        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if p[j - 1] == s[i - 1] or p[j - 1] == '.':
                    # If the current characters match or p[j-1] is '.', dp[i][j] depends on dp[i-1][j-1].
                    dp[i][j] = dp[i - 1][j - 1]
                elif p[j - 1] == '*':
                    # If p[j-1] is '*', it can represent zero occurrences (dp[i][j-2])
                    # or one or more occurrences (if p[j-2] matches s[i-1]).
                    dp[i][j] = dp[i][j - 2] or (p[j - 2] == s[i - 1] or p[j - 2] == '.') and dp[i - 1][j]
                else:
                    # In other cases, the characters don't match, and dp[i][j] is False.
                    dp[i][j] = False
        
        # The result is stored in dp[m][n], which represents whether the entire strings s and p match.
        return dp[m][n]
