

class Solution {
public:
    bool check (int i,int j , string s){
        while(i<=j){
            if(s[i] != s[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
            return true;
    }
    string longestPalindrome(string s) {
        int maxlen=0;
        int index =0;
        for(int i =0;i<s.size();i++){
            for(int j =i;j<s.size();j++){
                if(s[i]==s[j]){
                    bool ans = check(i,j,s);
                    if(ans){
                        if(j-i+1 > maxlen){
                            maxlen = j-i+1;
                            index =i;
                        }
                    }
                }
            }
        }
        return s.substr(index,maxlen);
    }
};