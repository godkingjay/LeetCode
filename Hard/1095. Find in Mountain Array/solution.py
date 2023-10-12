# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
#class MountainArray(object):
#    def get(self, index):
#        """
#        :type index: int
#        :rtype int
#        """
#
#    def length(self):
#        """
#        :rtype int
#        """

class Solution(object):
    def findInMountainArray(self, target, mountain_arr):
        def find_peak(mountain_arr):
            left, right = 0, mountain_arr.length() - 1
            while left < right:
                mid = left + (right - left) // 2
                if mountain_arr.get(mid) < mountain_arr.get(mid + 1):
                    left = mid + 1
                else:
                    right = mid
            return left

        def binary_search(left, right, is_increasing):
            while left <= right:
                mid = left + (right - left) // 2
                mid_val = mountain_arr.get(mid)
                if mid_val == target:
                    return mid
                if mid_val < target:
                    if is_increasing:
                        left = mid + 1
                    else:
                        right = mid - 1
                else:
                    if is_increasing:
                        right = mid - 1
                    else:
                        left = mid + 1
            return -1

        peak_index = find_peak(mountain_arr)
        result = binary_search(0, peak_index, True)
        if result == -1:
            result = binary_search(peak_index + 1, mountain_arr.length() - 1, False)
        return result