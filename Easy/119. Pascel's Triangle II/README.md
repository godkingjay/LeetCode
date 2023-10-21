# Pascel's Triangle II

Given an integer ```rowIndex```, return the rowIndex<sup>th</sup>(0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

![gif](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

### Example 1:
```
Input: rowIndex = 3
Output: [1,3,3,1]
```

### Example 2:
```
Input: rowIndex = 0
Output: [1]
```

### Example 3:
```
Input: rowIndex = 1
Output: [1,1]
```

## Constrains:
`0 <= rowIndex <= 33`

# Explaination:

This solution here, is Linear in time.

As we know we can get any element of Pascal's Triangle in O(N) time and constant space complexity. <br>
for first row first column we have <sub>1</sub>C<sub>1</sub> <br>
for second row first column we have <sub>2</sub>C<sub>1</sub> <br>
for second row second column we have <sub>2</sub>C<sub>2</sub> <br>
..... and so on <br>
Therefore we can infer, for i<sup>th</sup> row and j<sup>th</sup> column we have the number <sub>i</sub>C<sub>j</sub> <br>
<br>
And calculating this is pretty easy just in N time (factorial basically).<br>


# Solution 

### C Solution:
```c
int* getRow(int r, int* rS){
    int*ans = calloc(r + 1, sizeof(int));
    long temp=1;
    ans[0]=1;
    for(int i=1,up=r;i<=r;i++,up--){
        temp=temp*up/i;
        ans[i]=temp;
    }
    *rS = r+1;
    return ans;
}
```

### C++ Solution:
```cpp
class Solution {
public:
    vector<int> getRow(int r) {
        vector<int>v(r+1);
        long temp=1;
        v[0]=v[r]=1;
        for(int i=1,up=r,down=1;i<r;i++,up--,down++){
            temp = temp*up/down;
            v[i]=temp;
        }
        return v;
    }
};
```

### Java Solution:
```java
class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long temp = 1;
        for(int i=1,up=r,down=1;i<=r;i++,up--, down++){
            temp=temp*up/down;
            ans.add((int)temp);
        }
        return ans;
    }
}
```

### Python Solution:
```py
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
```

### Ruby Solution:
```rb
def get_row(r)
    return [1] if r==0
    ans = [1]
    temp = 1
    for i in 1...r do
        temp = temp * (r-i+1)/i
        ans << temp
    end
    ans << 1
    return ans
end
```

### C# Solution:
```cs
public class Solution {
    public IList<int> GetRow(int r) {
        var ans = new int[r+1];
        ans[0]=ans[r]=1;
        long temp=1;
        for(int i=1,up=r;i<r;i++,up--){
            temp = temp * up / i;
            ans[i]=(int)temp;
        }
        return ans;
    }
}
```

### Javascript Solution:
```js
var getRow = function(r) {
    var ans = new Array(r+1)
    ans[0]=ans[r]=1
    for(i=1,up=r;i<r;i++,up--)
        ans[i] = ans[i-1]*up/i
    return ans
};
```

### Typescript Solution:

```ts
function getRow(r: number): number[] {
    var ans:number[] = [1]
    var temp:number = 1
    for(var i:number=1;i<=r;i++){
        temp = temp*(r-i+1)/i
        ans.push(temp)
    }
    return ans
};
```