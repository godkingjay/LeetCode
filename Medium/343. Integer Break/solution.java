class Solution {
    public int integerBreak(int n) {
        if (n <= 1) {
            return 0; // We can't break integers less than or equal to 1.
        }

        if (n == 2) {
            return 1; // Special case: 1 * 1 is the only way to break 2.
        }

        if (n == 3) {
            return 2; // Special case: 1 * 2 is the only way to break 3.
        }

        int product = 1;

        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        return product * n;
    }
}
