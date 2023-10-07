#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans;
        if (strs.empty()) {
            return ans; // If the input vector is empty, return an empty string.
        }
        ans = strs[0];
        for(int i=1; i<strs.size(); i++) {
            for(int j=0; j<ans.size(); j++) {
                if(strs[i][j] != ans[j]) {
                    ans = ans.substr(0, j);
                    break; // No need to continue checking for this string.
                } 
            }
        }
        return ans;
    }
};

int main() {
    int n;
    cout << "Enter the number of strings: ";
    cin >> n;

    vector<string> strs(n);
    cout << "Enter " << n << " strings:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> strs[i];
    }

    Solution solution;
    string commonPrefix = solution.longestCommonPrefix(strs);

    if (!commonPrefix.empty()) {
        cout << "Longest Common Prefix: " << commonPrefix << endl;
    } else {
        cout << "There is no common prefix among the given strings." << endl;
    }

    return 0;
}
