class Solution(object):
    def isMatch(self, s, p):
        m, n = len(s), len(p)
        dp = [[False] * (n+1) for _ in range(m+1)]
        dp[0][0] = True  # empty pattern matches empty string

        # initialize first row (empty string)
        for j in range(1, n+1):
            if p[j-1] == '*':
                dp[0][j] = dp[0][j-2]

        # fill in remaining cells
        for i in range(1, m+1):
            for j in range(1, n+1):
                if s[i-1] == p[j-1] or p[j-1] == '.':
                    dp[i][j] = dp[i-1][j-1]
                elif p[j-1] == '*':
                    dp[i][j] = dp[i][j-2]
                    if s[i-1] == p[j-2] or p[j-2] == '.':
                        dp[i][j] |= dp[i-1][j]

        return dp[m][n]

def main():
    solution = Solution()
    str = input().split(" ")
    result = solution.isMatch(str[0], str[1])
    
    if result:
        print("true")
    else:
        print("false")

if __name__ == "__main__":
    main()
