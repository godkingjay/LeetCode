class Solution:
    def reverseWords(self, s: str) -> str:
        lists = s.split()
        answer = ' '.join(lists[::-1])
        return answer