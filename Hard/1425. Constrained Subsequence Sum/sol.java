import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        // call the fn here
    }
    class Solution {
        public int constrainedSubsetSum(int[] nums, int k) {
            int[] dp = Arrays.copyOf(nums, nums.length);
            Deque<Integer> q = new ArrayDeque<>();
            q.offerLast(0);
            for (int i = 1; i < nums.length; i++) {
                while (!q.isEmpty() && q.peekLast() < i - k) {
                    q.pollLast();
                }
                dp[i] = Math.max(dp[i], dp[q.peekLast()] + nums[i]);
                while (!q.isEmpty() && dp[q.peekFirst()] <= dp[i]) {
                    q.pollFirst();
                }
                q.offerFirst(i);
            }
            int max = Integer.MIN_VALUE;
            for (int num : dp) {
                max = Math.max(max, num);
            }
            return max;
        }
    }
}