### Algorithm for Calculating Maximum Profit from Stock Prices

1. Initialize `minprice` to positive infinity and `maxprofit` to 0. These variables will be used to keep track of the minimum price encountered and the maximum profit calculated.
2. Iterate through the array of stock prices, denoted as `prices`, using a loop variable `i`.
3. For each price `prices[i]` in the array:
   a. Check if `prices[i]` is less than the current `minprice`. If it is, update `minprice` to `prices[i]`. This step helps to keep track of the lowest price encountered so far.
   b. If `prices[i] - minprice` is greater than the current `maxprofit`, update `maxprofit` to `prices[i] - minprice`. This step calculates the potential profit if we buy at `minprice` and sell at the current price `prices[i]`.
4. Repeat steps 3a and 3b for each price in the `prices` array.
5. After iterating through all prices, `maxprofit` will contain the maximum profit that can be obtained by buying and selling stocks once.
6. Return the value of `maxprofit` as the result.

Example 1:

Input: prices = [7,1,5,3,6,4]

Output: 5

Example 2:

Input: prices = [7,6,4,3,1]

Output: 0
