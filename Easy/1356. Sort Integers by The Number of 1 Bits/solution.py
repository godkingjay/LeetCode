class Solution:
    def solve1(x: int) -> int:
        count = 0
        while x:
            x &= (x - 1)
            count += 1
        return count

    def sortByBits(self,arr: list) -> list:
        return sorted(arr, key=lambda x: (Solution.solve1(x), x))