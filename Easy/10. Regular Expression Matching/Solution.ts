const isMatch = (s: string, p: string): boolean => {
    const m = s.length;
    const n = p.length;
    const dp: boolean[][] = new Array(m + 1).fill(0).map(() => new Array(n + 1).fill(false));
    dp[0][0] = true; // empty pattern matches empty string

    // Initialize the first row (empty string)
    for (let j = 1; j <= n; j++) {
        if (p[j - 1] === '*') {
            dp[0][j] = dp[0][j - 2];
        }
    }

    // Fill in the remaining cells
    for (let i = 1; i <= m; i++) {
        for (let j = 1; j <= n; j++) {
            if (s[i - 1] === p[j - 1] || p[j - 1] === '.') {
                dp[i][j] = dp[i - 1][j - 1];
            } else if (p[j - 1] === '*') {
                dp[i][j] = dp[i][j - 2]; // zero occurrences
                if (s[i - 1] === p[j - 2] || p[j - 2] === '.') {
                    dp[i][j] = dp[i][j] || dp[i - 1][j]; // one or more occurrences
                }
            }
        }
    }
    return dp[m][n];
};

let s:string = "aa";
let p:string = "a*";
console.log(isMatch(s, p));