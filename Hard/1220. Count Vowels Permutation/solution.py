class Solution:
    def countVowelPermutation(self, n: int) -> int:
        MOD = 1000000007

        # Initialize counts for each vowel for length 1
        countA = 1
        countE = 1
        countI = 1
        countO = 1
        countU = 1

        # Iterate from length 1 to n - 1
        for length in range(1, n):
            # Calculate the next counts for each vowel based on the previous counts
            nextCountA = countE
            nextCountE = (countA + countI) % MOD
            nextCountI = (countA + countE + countO + countU) % MOD
            nextCountO = (countI + countU) % MOD
            nextCountU = countA

            # Update the counts with the newly calculated values for the next length
            countA = nextCountA
            countE = nextCountE
            countI = nextCountI
            countO = nextCountO
            countU = nextCountU

        # Calculate the total count of valid strings for length n
        totalCount = (countA + countE + countI + countO + countU) % MOD

        return int(totalCount)