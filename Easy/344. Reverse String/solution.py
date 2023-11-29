class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        i, j = 0, len(s) - 1
        sList = list(s) # convert str into list, easy to operate
        while i < j:
            tmp = sList[i]
            sList[i] = sList[j]
            sList[j] = tmp
            i += 1
            j -= 1
        return ''.join(sList)