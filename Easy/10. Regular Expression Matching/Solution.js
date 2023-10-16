var isMatch = function(s, p) {
    const m = s.length, n = p.length;
    const dp = new Array(m+1).fill().map(() => new Array(n+1).fill(false));
    dp[0][0] = true; // empty pattern matches empty string

    // initialize first row (empty string)
    for (let j = 1; j <= n; j++) {
        if (p[j-1] === '*')
        dp[0][j] = dp[0][j-2];
    }

    // fill in remaining cells
    for (let i = 1; i <= m; i++) {
        for (let j = 1; j <= n; j++) {
        if (s[i-1] === p[j-1] || p[j-1] === '.') {
            dp[i][j] = dp[i-1][j-1];
        } else if (p[j-1] === '*') {
            dp[i][j] = dp[i][j-2]; // zero occurrences
            if (s[i-1] === p[j-2] || p[j-2] === '.') {
            dp[i][j] = dp[i][j] || dp[i-1][j]; // one or more occurrences
            }
        }
        }
    }
    return dp[m][n];
}

s = "aa";
p = "a*"
console.log(isMatch(s, p))