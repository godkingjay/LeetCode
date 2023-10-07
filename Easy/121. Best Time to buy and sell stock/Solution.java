public class Solution {
    public int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        // Iterate through the array of stock prices.
        for (int i=0;i<prices.length;i++){
            // Check if the current price is lower than the current minimum price.
            if(prices[i] < minprice)
                minprice = prices[i]; // Update the minimum price.
            else if(prices[i] - minprice > maxprofit)

                // Calculate and update the maximum profit.
                maxprofit = prices[i] - minprice;
        }
        // Return the maximum profit.
        return maxprofit;
    }
    
}
