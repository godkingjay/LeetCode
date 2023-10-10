class Solution:
    def searchRange(self, N, T):
        Tleft = self.find(T, N, 0)
        if Tleft == len(N) or N[Tleft] != T:
            return [-1, -1]
        return [Tleft, self.find(T + 1, N, Tleft) - 1]

    def find(self, target, arr, left):
        right = len(arr) - 1
        while left <= right:
            mid = (left + right) // 2
            if arr[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return left
