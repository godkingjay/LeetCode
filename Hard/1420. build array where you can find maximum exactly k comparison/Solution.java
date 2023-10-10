class Solution {
    public int numOfArrays(int n, int m, int k) {
        final int MODULO = 1000000007;
        int[][][] dp = new int[n + 1][m + 1][k + 2];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int p = 0; p <= k; p++) {
                    for (int q = 1; q <= m; q++) {
                        if (q > j)
                            dp[i + 1][q][p + 1] = (dp[i + 1][q][p + 1] + dp[i][j][p]) % MODULO;
                        else
                            dp[i + 1][j][p] = (dp[i + 1][j][p] + dp[i][j][p]) % MODULO;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= m; i++)
            count = (count + dp[n][i][k]) % MODULO;
        return count;
    }
}