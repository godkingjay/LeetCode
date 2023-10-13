# Problem Title

Longest Palindromic Substring

## Problem Description

Given a string s, return the longest `palindromic substring` in s.

Here are some key points to understand about the problem:

1. You are given a string s, and the goal is to find the longest palindromic substring within this string. 
2. A palindromic substring is a sequence of characters that reads the same forwards as it does backward.
3. s consist of only digits and English letters.

## Method to Solve

`Initialization:` Start with an empty result res and a length tracker reslen set to 0.

`Iterate Through String:` For each character in the string, consider it as the center of a possible palindrome.

`Odd-Length Palindromes:` Expand around the center character, checking for palindromes with odd lengths.

`Even-Length Palindromes:` Also, check for palindromes with even lengths by considering adjacent characters.

`Update Result:` Whenever a longer palindrome is found, update res and reslen.

`Return Longest Palindrome:` After checking all centers, return the longest palindromic substring found in the string.