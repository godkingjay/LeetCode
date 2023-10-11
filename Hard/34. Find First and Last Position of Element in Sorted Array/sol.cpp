#include <vector>

class Solution {
public:
    std::vector<int> searchRange(std::vector<int>& N, int T) {
        int Tleft = find(T, N, 0);
        if (Tleft == N.size() || N[Tleft] != T) {
            return {-1, -1};
        }
        return {Tleft, find(T + 1, N, Tleft) - 1};
    }

    int find(int target, std::vector<int>& arr, int left) {
        int right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
};
