class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int prev=0;
        String ans = "";
        int r=0,t=0;
        for(int i =0;i< s.length();i++){
            r=0;
          for(int j=0;j<ans.length();j++){
            if(s.charAt(i)== ans.charAt(j)){
              r++;
              t=j;
              break;
            }
          }
          if(r==0){
            ans += s.charAt(i);
          }else{
            if(t==0 && ans.length()!=0){
                ans += s.charAt(i);
                ans= ans.substring(1,ans.length());
            }else{
            if((ans.length())>prev){
              
            prev =ans.length();
            }  
                 ans += s.charAt(i);    
              ans=""+ans.substring(t+1,ans.length());
            }
            }
            System.out.println(ans);
            }
        length = ans.length();
        if(prev>length)
        return prev;
        else 
        return length;
    }
}
