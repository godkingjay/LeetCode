class Solution {
    public int numDistinct(String s, String t) {
        
        int[] prev = new int[t.length()+1];
        prev[0]=1;
        
        for(int i =1; i<=s.length(); i++){
            for(int j =t.length(); j>=1; j--){
                if(s.charAt(i-1)==t.charAt(j-1)){
                     prev[j] = prev[j-1] + prev[j];
                }
            }
        }
        return prev[t.length()];
    }
}
