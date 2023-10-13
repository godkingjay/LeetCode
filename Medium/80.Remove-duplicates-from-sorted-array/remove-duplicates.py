class Solution(object):
    def removeDuplicates(self, nums):
        index = 2
        i = 0
        while (index < len(nums)):
            if nums[i] == nums[index]:
                nums.pop(index)
            else:
                i+=1
                index+=1
        return index
