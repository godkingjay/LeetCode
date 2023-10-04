class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k=0;
        String result= "";
      for(int i=0;i<strs[0].length();i++){
          k=0;
          for(int j=1;j<strs.length;j++){
              k=0;
              if(i< strs[j].length()){
              if(strs[0].charAt(i) != strs[j].charAt(i)  ){
                  k++;
                  return result;
              }
              }
              else
              return result;
          }
          if(k==0)
              result += strs[0].charAt(i);
      }
      return result;
    }
}
