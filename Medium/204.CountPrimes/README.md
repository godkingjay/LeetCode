# LeetCode 204 - Count Primes

## Problem Statement
Given an integer `n`, return the number of prime numbers that are strictly less than `n`.

### Test Cases

#### Example 1
- Input: `n = 10`
- Output: `4`
- Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

#### Example 2
- Input: `n = 0`
- Output: `0`

## Solution
This solution utilizes the Sieve of Eratosthenes algorithm to efficiently count the number of prime numbers less than `n`.

### Pseudocode
```java
public int countPrimes(int n) {
    // Using Sieve of Eratosthenes
    boolean prime[] = new boolean[n + 1];
    int count = 0;
    Arrays.fill(prime, true);
    prime[0] = false;
    for (int i = 2; i * i <= n; i++) {
        if (prime[i] == true) {
            for (int j = i * i; j <= n; j += i)
                prime[j] = false;
        }
    }
    for (int i = 2; i < n; i++)
        if (prime[i])
            count++;
    return count;
}
