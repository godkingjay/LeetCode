public class Solution {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        double logResult = Math.log10(n) / Math.log10(3);
        
        return Math.floor(logResult) == logResult;
    }
}
