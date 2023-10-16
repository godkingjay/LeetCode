class Solution(object):
    def getRow(self, r):
        ans = [1]*(r+1)
        up = r
        down = 1
        for i in range(1, r):
            ans[i] = ans[i-1]*int(up/down)
            up = up - 1
            down = down + 1
        return ans
    
r = int(input())    
object = Solution()
print(object.getRow(r))    
    