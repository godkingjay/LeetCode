/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  let l = 0;
  let r = 1;
  let max = 0;
  let profit = 0;

  while (r < prices.length) {
    profit = prices[r] - prices[l];
    if (profit > 0) {
      max = profit > max ? profit : max;
    } else {
      l = r;
    }
    r++;
  }
  return max;
};
