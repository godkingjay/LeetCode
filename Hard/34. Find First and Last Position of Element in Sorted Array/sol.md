This problem is very nearly the definition of a binary search. A binary search allows us to find the insertion index for a target number in a sorted array. It's called a "binary" search because in each step it halves the input array and determines in which half the number belongs. Since a binary search is able to eliminate half the remaining array in each iteration, it can accomplish its objective with a time complexity of O(log N).

In this case, however, we don't just want to find out where the target number (T) would be placed in the nums array (N), we want to additionally find out if T actually exists in N, as well as the starting and end indexes.

The standard implementation of a binary search will find the left-most index in which T could be placed, though many languages have functions for both sides. Rather than having to define two sets of functions here, however, we can, with a little creativity, use a single function to find our answer.

First, we can perform the standard left binary search (find) on T. Next, we can easily check to see if T exists in N already by checking the value stored at the result of that first search (N[Tleft]). If we don't find T at that index, then T does not exist in N and we should return [-1, -1].

Otherwise, we still need to find the right end of the range of T values in N. To do this, we can just use find again, this time with the next integer (T + 1). Since this will find the index after the end of the range of T values, we can just move back one position to find the end of the T range.

Now that we have our range, we can return it.

- Time Complexity: O(log N) for the binary search
- Space Complexity: O(1)
