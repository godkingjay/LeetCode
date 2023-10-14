from numpy import inf

class Solution(object):
    def paintWalls(self, cost, time):
      
        n = len(cost)
        dp = [0] + [inf] * n
        for c, t in zip(cost, time):
            for j in range(n, 0, -1):
                dp[j] = min(dp[j], dp[max(j - t - 1, 0)] + c)
        return dp[n] 