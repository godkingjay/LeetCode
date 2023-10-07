### Simplest and Easy Approach to Understand and solve a problem

1. Split the input string 's' into an array of words using space as the delimiter, and store them in the 'words' array.
2. Create an empty StringBuilder called 'result' to store the reversed sentence.
3. Initialize the 'end' variable to the index of the last word in the 'words' array.
4. Iterate through the 'words' array in a forward order.
5. Inside the loop, check if the current word is not empty.
6. If the current word is not empty, insert it at the beginning of the 'result' StringBuilder.
7. If the current word is not the last word, add a space character before it to separate words.
8. Repeat steps 5-7 for all words in the 'words' array.
9. Convert the 'result' StringBuilder to a string using the toString() method.
10. Return the reversed sentence as the result.

Example 1:

Input: s = "the sky is blue"

Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "

Output: "world hello"