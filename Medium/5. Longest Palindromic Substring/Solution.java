public class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int reslen=0;

        for(int i=0;i<s.length();i++){
            // odd length
            int left=i,right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if((right-left+1)>reslen){
                    res=s.substring(left,right+1);
                    reslen=right-left+1;
                }
                left-=1;
                right+=1;
            }

            // even length;
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if((right-left+1)>reslen){
                    res=s.substring(left,right+1);
                    reslen=right-left+1;
                }
                left-=1;
                right+=1;
            }
        }
        return res;
    }
}
