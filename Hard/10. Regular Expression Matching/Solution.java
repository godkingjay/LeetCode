import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true; // empty pattern matches empty string

        // initialize first row (empty string)
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j-1) == '*')
                dp[0][j] = dp[0][j-2];
        }

        // fill in remaining cells
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i][j-2]; // zero occurrences
                    if (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') {
                        dp[i][j] = dp[i][j] || dp[i-1][j]; // one or more occurrences
                    }
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String str[] = input.readLine().split(" ");

        Solution obb = new Solution();
        if(obb.isMatch(str[0], str[1])) {
            output.write("true\n");
            output.flush();
        } else {
            output.write("false\n");
            output.flush();
        }
    }
}