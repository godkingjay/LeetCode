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

# Solutions

## Reverse till half then compare

The idea is to compare the left half of `n` to the reverse of its right half. If they are equal then `n` is ***palindrome***.

If `n < 0` or if, when `n != 0` and `n % 10 == 0`, which means that `n` is a multiple of `10`, then `n` is not a ***palindrome***.

**The code goes as such:**
```python3
if x < 0 or (x != 0 and x % 10 == 0):
    return False
```
