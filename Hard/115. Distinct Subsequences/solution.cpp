class Solution {
public:
    int numDistinct(string s, string t) {
        int m = s.size(), n = t.size(), mod = 1e9+7;
        if(m < n) return 0; // If the length of string s is less than the length of string t, there can be no distinct subsequences, so return 0.

        // Create a 2D vector dp to store the number of distinct subsequences.
        vector<vector<int>> dp(m, vector<int>(n, 0));

        // Initialize dp[0][0] based on whether the first characters of s and t match.
        dp[0][0] = s[0] == t[0];

        // Initialize the first column of dp.
        for(int i = 1; i < m; i++) {
            if(s[i] == t[0])
                dp[i][0] = (dp[i-1][0] % mod + 1) % mod; // If the characters match, add 1 to the previous value.
            else
                dp[i][0] = dp[i-1][0]; // If the characters don't match, copy the value from the previous row.
        }
        
        // Fill in the rest of the dp matrix.
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(s[i] == t[j])
                    dp[i][j] = (dp[i-1][j] % mod + dp[i-1][j-1] % mod) % mod; // Characters match, so add values from the previous row and the diagonal.
                else
                    dp[i][j] = dp[i-1][j]; // Characters don't match, so copy the value from the previous row.
            }
        }

        // The final result is stored in dp[m-1][n-1], which represents the number of distinct subsequences.
        return dp[m-1][n-1];
    }
};
