#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool isMatch(string s, string p) {
        int m = s.size(), n = p.size();
        std::vector<std::vector<bool>> dp(m+1, std::vector<bool>(n+1, false));
        dp[0][0] = true; // empty pattern matches empty string

        // initialize first row (empty string)
        for (int j = 1; j <= n; j++) {
            if (p[j-1] == '*')
                dp[0][j] = dp[0][j-2];
        }

        // fill in remaining cells
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s[i-1] == p[j-1] || p[j-1] == '.') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p[j-1] == '*') {
                    dp[i][j] = dp[i][j-2]; // zero occurrences
                    if (s[i-1] == p[j-2] || p[j-2] == '.') {
                        dp[i][j] = dp[i][j] || dp[i-1][j]; // one or more occurrences
                    }
                }
            }
        }
        return dp[m][n];
    }
};

int main() {
    string s, p; cin >> s >> p;
    
    Solution obb;
    if(obb.isMatch(s,p)) {
        cout << "true\n";
    } else {
        cout << "false\n";
    }
    return 0;
}