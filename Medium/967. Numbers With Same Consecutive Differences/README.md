# Problem #967 ([Numbers With Same Consecutive Differences](https://leetcode.com/problems/numbers-with-same-consecutive-differences/) | Backtracking, Breadth First Search)

Return all **non-negative** integers of length `n` such that the absolute difference between every two consecutive digits is `k`.

Note that `every` number in the answer `must not` have leading zeros. For example, 01 has one leading zero and is invalid.

You may return the answer in `any order`.

## Example 1

**Input:**

    n = 3, k = 7
<br/>

**Output:**

    [181,292,707,818,929]
<br/>

**Explanation:**

    Note that 070 is not a valid number, because it has leading zeroes.

## Example 2

**Input:**

    n = 2, k = 1
<br/>

**Output:**

    [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
<br/>

## Constraints
- `2 <= n <= 9`
- `0 <= k <= 9`

# Solutions

### Basic Idea

Problem asks us to return a list of values(*integers*) in which the **absolute difference** of each *two consecutive digits* is `k` and the length of the number is `n`.

**Sample** <br/>

    n = 3, k = 4
- This means that the numbers in the list should have a length of `3` and each *two consecutive digits* of a number has an **absolute difference** of `4`.
<br/>

    Output: [151,159,262,373,404,484,515,595,626,737,840,848,951,959]
- Notice that some number of *two consecutive digits* has the same first digit but different second digit. Numbers such as:
    - `[151,159]`
    - `[404,484]`
    - `[840,848]`
    - `[951,959]`

- From these numbers we can conclude that two numbers of *two consecutive digits* with same first digit but different second digit can have the same *absolute difference*. Pairs such as(*where `k = 4`*):
    - `(5, 1)` and `(5, 9)`
    - `(4, 0)` and `(4, 8)`

## Breadth First Search(Iterative)

### Code
- **Java**
```java
class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if(n == 1) return new int[]{k};
        List<Integer> list = new ArrayList<Integer>();
        int min = (int) Math.pow(10, n - 1);
        for(int i = 1; i < 10; i++){
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(i);
            while(!q.isEmpty()){
                int num = q.poll();
                if (num >= min){
                    list.add(num);
                    continue;
                }
                int x = num%10;
                if(k > 0 && x - k >= 0)
                    q.add(num * 10 + x - k);
                if(x + k < 10)
                    q.add(num * 10 + x + k);
            }
        }
        return list.stream()
                   .mapToInt(i -> i)
                   .toArray();
    }
}
```
![image](https://user-images.githubusercontent.com/89616705/188256992-ad7db9e5-fd3b-4e19-808a-5d4b69ddae29.png)

- **C++**
```cpp
class Solution {
public:
    vector<int> numsSameConsecDiff(int n, int k) {
        if(n == 1) return vector<int>{k};
        vector<int> list;
        int min = pow(10, n - 1);
        for(int i = 1; i < 10; i++){
            queue<int> q;
            q.push(i);
            while(!q.empty()){
                int num = q.front();
                q.pop();
                if(num >= min){
                    list.push_back(num);
                    continue;
                }
                int x = num % 10;
                if(k > 0 && x - k >= 0)
                    q.push(num * 10 + x - k);
                if(x + k < 10)
                    q.push(num * 10 + x + k);
            }
        }
        return list;
    }
};
```
![image](https://user-images.githubusercontent.com/89616705/188256807-018745eb-59e1-4be9-b809-e3347ccd281d.png)

- **Python**
```python3
class Solution:
    def numsSameConsecDiff(self, n: int, k: int) -> List[int]:
        list = []
        min = pow(10, n - 1)
        for i in range (1, 10):
            q = [i]
            while len(q):
                num = q.pop(0)
                if num >= min:
                    list.append(num)
                    continue
                x = num % 10
                if k > 0 and x - k >= 0:
                    q.append(num * 10 + x - k)
                if x + k < 10:
                    q.append(num * 10 + x + k)
        return list
```
![image](https://user-images.githubusercontent.com/89616705/188257741-439d2469-cdf0-4e62-ad89-8f86642cfac6.png)
