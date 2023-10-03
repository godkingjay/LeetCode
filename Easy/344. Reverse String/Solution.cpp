class Solution {
public:
    void reverseString(vector<char>& s) {
    int n = s.size();
    int x = 0;
    int y = n - 1;
    while(x < y){
        std::swap(s[x], s[y]);
        x++;
        y--;
    }
    }
};