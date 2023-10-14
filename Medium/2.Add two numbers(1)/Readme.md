It's time to sum up these node value, for that we will create one another variable let's called it sum and put the sum of l1 & l2 them into our dummy list. So, we start it from all the way left go to all the way right. 
Now you will ask, dude what about the carry values we get after sum up.
Well, hold on i'm coming on that point don't worry.

So, for that what you have to do is, we will intialize one more variable name carry if we found carry of let's say 10. First we will modulo it like carry = sum % 10 i.e. carry = 10 % 10 i.e. 0 we will add 0 into our node and after that what we will do is get the carry as carry = sum / 10 i.e. carry = 10 / 10 i.e. 1. Now we are having carry as 1. So, in the next node sum of l1 & l2 we will add carry as well.