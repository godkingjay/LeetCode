# Problem #13 ([Roman to Integer](https://leetcode.com/problems/roman-to-integer/))

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

| Symbol | Value |
| ------ | ---   |
| I      | 1     |  
| V      |     5 |   
|X       |     10| 
|L       |   50  |  
|C       |   100 | 
|D       |   500 | 
|M       |   1000| 

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II. <br/>

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used: <br/>

- `I` can be placed before `V` (5) and `X` (10) to make 4 and 9. <br/>
- `X` can be placed before `L` (50) and `C` (100) to make 40 and 90. <br/>
- `C` can be placed before `D` (500) and `M`(1000) to make 400 and 900. <br/>
- Given a roman numeral, convert it to an integer.

***

### **Example 1**

**Input:** s = ` "III" ` <br/>
**Output:**` 3 `<br/>
**Explanation:**  ` III = 3. `

***

### **Example 2**

**Input:** s =` "LVIII" `<br/>
**Output:** ` 58 ` <br/>
**Explanation:**` L = 50, V= 5, III = 3. `

***
### **Example 3**

**Input:** s = ` "MCMXCIV" ` <br/>
**Output:** ` 1994 `<br/>
**Explanation:** ` M = 1000, CM = 900, XC = 90 and IV = 4. `

***

### **Constraints:**


- `1 <= s.length <= 15`
- `s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').`
- `It is guaranteed that s is a valid roman numeral in the range [1, 3999].`
### **Solution**
- **JAVA** <br/>
```java: 
class Solution {
    static int num(int i){
        int l=0;
           switch(i){
	               case 'I' : l= 1;
	               break;
	               case 'V' : l= 5;
	               break;
	               case 'X' : l= 10;
	               break;
	               case 'L' : l= 50;
	               break;
	               case 'C' : l= 100;
	               break;
	               case 'D' : l= 500;
	               break;
	               case 'M' : l= 1000;
	               break;
           }
           return l;
    }
    public int romanToInt(String s) {
        int k1,k2;
        k1= num(s.charAt(s.length()-1));
        int k =k1;
        for(int i = s.length()-2;i>=0;i--){
            k2 = num(s.charAt(i));
            if(k2<k1){
                k=k-k2;
            }else{
                k = k+k2;
            }
            k1=k2;
        }
        return k;
    }
}
```
- C++ :  
``` c++:
  	#include <iostream>
	#include <string>
	
	using namespace std;
	
	class Solution {
	public:
	    int romanToInt(string s) {
	        int sum = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s[i] == 'I') {
	                if (s[i + 1] == 'V') {
	                    sum = sum + 4;
	                    i++;
	                } else if (s[i + 1] == 'X') {
	                    sum = sum + 9;
	                    i++;
	                } else {
	                    sum = sum + 1;
	                }
	            } else if (s[i] == 'V') {
	                sum = sum + 5;
	            } else if (s[i] == 'X') {
	                if (s[i + 1] == 'L') {
	                    sum = sum + 40;
	                    i++;
	                } else if (s[i + 1] == 'C') {
	                    sum = sum + 90;
	                    i++;
	                } else {
	                    sum = sum + 10;
	                }
	            } else if (s[i] == 'L') {
	                sum = sum + 50;
	            } else if (s[i] == 'C') {
	                if (s[i + 1] == 'D') {
	                    sum = sum + 400;
	                    i++;
	                } else if (s[i + 1] == 'M') {
	                    sum = sum + 900;
	                    i++;
	                } else {
	                    sum = sum + 100;
	                }
	            } else if (s[i] == 'D') {
	                sum = sum + 500;
	            } else if (s[i] == 'M') {
	                sum = sum + 1000;
	            }
	        }
	        return sum;
	    }
	};

	int main() {
	    string romanNumeral;
	    cout << "Enter a Roman numeral: ";
	    cin >> romanNumeral;
	
	    Solution solution;
	    int integerEquivalent = solution.romanToInt(romanNumeral);
	
	    cout << "Integer equivalent: " << integerEquivalent << endl;
	
	    return 0;
	}
```
