## Constant Space Approach (No Strings)
1. Store the absolute value of the input in a new variable. This is done so that when later we %10 the value, we don't receive negative values which will mess up the algorithm.
2. Create a new integer variable for the result to be stored and initialize it to 0.
3. Next, run a while loop till x>0 and within each iteration we take the last digit of the input and add it to the 10 times of the result. We also divide the value of the input by 10 to remove the last digit.
4. This way all the digits get reversed in the result variable, and we return the result with a positive or a negative sign as per the original input.
5. Since there might be overflows, within each iteration at the beginning we check whether the new value of n is less than the maximum value. Here we convert all the +'s to -'s and *'s to /'s by transferring the variables to RHS to avoid the overflow.
  

### Example Input: -321

x = 321
n = 0

1. n = 0*10 + 321%10 = 1, x = 321/10 = 32
2. n = 1*10 + 32%10 = 12, x = 32/10 = 3
3. n = 12*10 + 3%10 = 123, x = 3/10 = 0

n = 123  
Since input is negative, return -123

*Time Complexity: O(n)*  
*Space Complexity: O(1)*