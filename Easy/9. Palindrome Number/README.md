# Problem #9 ([Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Math)

Given an integer `x`, return `true` if *x is palindrome integer*.

An integer is a *palindrome* when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.

## Example 1
**Input:**

    x = 121
<br/>

**Output:**

    true
<br/>

**Explanation:**

    121 reads as 121 from left to right and from right to left.

## Example 2
**Input:**

    x = -121
<br/>

**Output:**

    false
<br/>

**Explanation:**

    From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

## Example 3
**Input:**

    x = 10
<br/>

**Output:**

    false
<br/>

**Explanation:**

    Reads 01 from right to left. Therefore it is not a palindrome.

## Constraints
- -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1

### Follow Up: `Could you solve it without converting the integer to a string?`
