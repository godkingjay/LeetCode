class Solution {
public:
    string convert(string s, int numRows) {
        string ans = "";
        int n = s.length();
        int ind = 0, r = 0;
        // If the string is empty, has only one character, or numRows is 1, return the input string as-is.
        if (n <= 2 || numRows == 1)
            return s;
        
        for (int i = 0; i < numRows; i++) {
            while (ind < n) {
                // Append the current character to the answer string.
                ans += s[ind];
                
                // If we are not in the first row, last row, and the next character within the string bounds,
                // append the character at an offset of 2*i from the current position.
                if (r > 0 && i > 0 && i < numRows - 1 && ind + 2 * i <= n - 1) {
                    ans += s[ind + 2 * i];
                }
                
                // Calculate the next index position based on the row and whether it's the first row or not.
                if ((r == 0 || i == 0) && i != numRows - 1)
                    ind += 2 * (numRows - i - 1);
                else
                    ind += 2 * (numRows - 1);
                
                r++;
            }
            // Reset ind to the next row's starting position and reset r to 0 for the new row.
            ind = i + 1;
            r = 0;
        }
        return ans;
    }
};
