# Regular Expression Matching

Given an input string `s` and a pattern `p`, implement regular expression matching with support for `.` and `*` where :

- `*` Matches zero or more of the preceding element.
- `.` Matches any single character.​​​​

The matching should cover the entire input string (not partial).


## Example 1:
```
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
```

## Example 2:
```
Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
```

## Example 3:
```
Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
```

## Constraints:

- 1 <= s.length <= 20
- 1 <= p.length <= 20
- s contains only lowercase English letters.
- p contains only lowercase English letters, '.', and '*'.
- It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.


## Explaination:
The problem requires to match a given string s with a pattern p. The pattern p can contain two special characters, '' and '.'. The '' matches zero or more of the preceding character and '.' matches any single character.

### Approach

We can use dynamic programming to solve this problem. Let `dp[i][j]` be a boolean value representing whether the first i characters of s match the first j characters of p.

First, we initialize `dp[0][0]` to true since an empty pattern matches an empty string.

Next, we need to consider the first row of the dp matrix. If the pattern p starts with a '' then it can match zero occurrences, so we set `dp[0][j]` to `dp[0][j-2]` for all j where `p[j-1]` == ''.

Now we fill in the remaining cells of the dp matrix using the following rules:

If the i-1th character of s matches the j-1th character of p or the j-1th character of p is '.', then `dp[i][j]` is equal to `dp[i-1][j-1]`.
If the j-1th character of p is '*', then we have two cases:

a. Zero occurrences: `dp[i][j]` is equal to `dp[i][j-2]`
b. One or more occurrences: `dp[i][j]` is equal to `dp[i-1][j]` if the i-1th character of s matches the j-2th character of p or the j-2th character of p is '.'.

Finally, we return `dp[m][n]`, which represents whether the entire string s matches the entire pattern p.

### Complexity:

- Time Complexity:
  The time complexity of the algorithm is `O(m * n)`, where m and n are the lengths of s and p, respectively. This is because we need to fill in the entire dp matrix.

- Space Complexity:
  The space complexity of the algorithm is also `O(m * n)` because we need to create a dp matrix of size `(m+1) * (n+1)`.

### Java Solution
```java
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
}
```


### C++ Solution

```cpp
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
```

### Python Solution

```py
class Solution(object):
    def isMatch(self, s, p):
        m, n = len(s), len(p)
        dp = [[False] * (n+1) for _ in range(m+1)]
        dp[0][0] = True # empty pattern matches empty string

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
```


### Javascript Solution

```js
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
```

### Typescript Solution

```ts
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
```