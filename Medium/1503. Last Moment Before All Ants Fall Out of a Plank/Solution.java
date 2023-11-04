class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int t1 = 0;
        int t2 = 0;
        if (left.length > 0)
            t1 = left[left.length - 1];
        if (right.length > 0)
            t2 = n - right[0];
        return Math.max(t1, t2);
    }
}