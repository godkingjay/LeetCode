/*
    The well-formed parentheses are the parentheses that are properly nested and balanced like this : (), ()(), (())
    The steps to ensure those properties are the following:
    1. As long as the number of open parentheses is less than n, we can add new open parentheses.
    2. If the number of open parentheses is equal to n, we should add new close parentheses.
    3. As long as the number of closed parentheses is less than the open parentheses, we can add new close parentheses.
    The following representation gives you an example when n = 3:
    
                "(" ")"
                /       \
            "("         ")" 
            / \         / \
          "("  ")"    "("  ")"          
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        backtrack(res,n,0,0,"");
        return res;
    }
    private void backtrack(List<String> res, int n, int l, int r, String s){
        if(s.length() == n*2){
            res.add(s);
            return;
        }
        if(l<n) backtrack(res,n,l+1,r,s+"(");
        if(r<l) backtrack(res,n,l,r+1,s+")");
    }
}