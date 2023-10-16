public class Solution {
    public int trailingZeroes(int n) {
        
        int zero=0;
		
        for(int i=5 ; i<=n ; i=i*5){
            zero = zero + n/i;
        }
        
        return zero;
        
    }
    
}
