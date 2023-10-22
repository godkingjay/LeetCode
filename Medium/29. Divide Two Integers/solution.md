# PROBLEM

Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

# APPROACH

The idea here is to use addition efficiently to compute the final result...
we know that division can be done using addition or subtraction...
for example 20/3 = 3+3+3+3+3+3+(2, ignored) (result is 6 times 3 hence 6)

Hence the loop is run, n times where n is our result...
To more efficiently compute this, we can reduce the loops to log n time by adding divisor everytime it is added on...

So 20/3 = 3 + 6 + 12 + (24, ignore) (curr result is 2^(3-1)=4, 3 here is number of iterations...)
left over sum, 20-12 = 8, and we repeat the process...
So 8/3 = 3 + 6 + (12, ignore) (this time result is 2^(2-1)=2, 2 here is number of iterations...)
left over sum, 8-6 = 2, since 2 is less than 3, we terminate the process...

Hence final result is 4+2 = 6
