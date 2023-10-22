class Solution:
    def maxDotProduct(self, nums1: List[int], nums2: List[int]) -> int:
        n, m = len(nums1), len(nums2)
        memo = [[float('-inf')] * m for _ in range(n)]
        
        def dp(i, j):
            if i == n or j == m:
                return float('-inf')
            
            if memo[i][j] != float('-inf'):
                return memo[i][j]
            
            memo[i][j] = max(
                nums1[i] * nums2[j] + max(dp(i + 1, j + 1), 0),
                dp(i + 1, j),  
                dp(i, j + 1), 
            )
            
            return memo[i][j]
        
        return dp(0, 0)