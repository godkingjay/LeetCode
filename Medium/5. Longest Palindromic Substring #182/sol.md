Intuition :

The obvious brute force solution is to pick all possible starting and ending positions for a substring, and verify if it is a palindrome. There are a total of n^2 such substrings (excluding the trivial solution where a character itself is a palindrome). Since verifying each substring takes O(n) time, the run time complexity is O(n^3).
Algorithm :

    Pick a starting index for the current substring which is every index from 0 to n-2.
    Now, pick the ending index for the current substring which is every index from i+1 to n-1.
    Check if the substring from ith index to jth index is a palindrome.
    If step 3 is true and length of substring is greater than maximum length so far, update maximum length and maximum substring.
    Print the maximum substring.

Complexity Analysis

    Time complexity : O(n^3). Assume that n is the length of the input string, there are a total of C(n, 2) = n(n-1)/2 substrings (excluding the trivial solution where a character itself is a palindrome). Since verifying each substring takes O(n) time, the run time complexity is O(n^3).

    Space complexity : O(1).
