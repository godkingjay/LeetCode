#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.length();
        int st = 0;
        int max_len = 1;

        if(n == 1) return s;

        for(int i=0; i < n-1; i++) {
            int l = i, r = i;
            while(l >= 0 && r < n && s[l] == s[r]) {
                l--;
                r++;
            } 
            int len = r-l-1;
            if(len > max_len) {
                max_len = len;
                st = l+1;
            }
        }

        for(int i=0; i < n-1; i++) {
            int l = i, r = i+1;
            while(l >= 0 && r < n && s[l] == s[r]) {
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > max_len) {
                max_len = len;
                st = l+1;
            }
        }

        return s.substr(st, max_len);
    }
};

int main() {
    Solution sol;
    string input;
    cout << "Enter a string: ";
    cin >> input;
    cout << "Longest Palindromic Substring: " << sol.longestPalindrome(input) << endl;
    return 0;
}
