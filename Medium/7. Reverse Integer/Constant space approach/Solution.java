class Solution {
    public int reverse(int num) {
        int x = Math.abs(num); //This ensures x%10 doesn't return -ve values 
        int n = 0;
        while(x>0) {
            if(n > (Integer.MAX_VALUE - x%10)/10) return 0;
            n = n*10 + x%10;
            x = x/10;
        }
        return num < 0 ? -n : n;
    }
}