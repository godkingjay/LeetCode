Define a constant MOD to handle modular arithmetic to avoid integer overflow.

Initialize five variables: countA, countE, countI, countO, and countU, each representing the count of valid strings of length 1 ending with the respective vowel ('a', 'e', 'i', 'o', 'u').

Use a for loop to iterate from length = 1 to n - 1 because we already have the counts for length 1, and we want to calculate the counts for lengths 2 to n.

Inside the loop, calculate the counts for each vowel for the next length based on the counts for the current length. The transitions are based on the given rules:

countA for the next length is the count of strings ending with 'e'.
countE for the next length is the count of strings ending with 'a' or 'i'.
countI for the next length is the count of strings ending with 'a', 'e', 'o', or 'u'.
countO for the next length is the count of strings ending with 'i' or 'u'.
countU for the next length is the count of strings ending with 'a'.
Update the variables countA, countE, countI, countO, and countU with the newly calculated counts for the next length.

After the loop, the variables contain the counts of valid strings of length n ending with each vowel.

Calculate the total count of valid strings for length n by summing up the counts for all vowels and take the result modulo MOD.

Return the total count as an integer.

The approach uses dynamic programming to efficiently compute the counts for different string lengths, following the rules for vowel transitions, and calculates the final result for length n.