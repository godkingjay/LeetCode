using System;
using System.Collections.Generic;

public class Solution {
    public IList<int> GetRow(int r) {
        var ans = new int[r + 1];
        ans[0] = ans[r] = 1;
        long temp = 1;
        for (int i = 1, up = r; i < r; i++, up--) {
            temp = temp * up / i;
            ans[i] = (int)temp;
        }
        return ans;
    }
}

public class Program {
    public static void Main() {
        Solution solution = new Solution();
        int rowNumber = 5;  // You can change this to the desired row number
        IList<int> result = solution.GetRow(rowNumber);
        Console.WriteLine($"Row {rowNumber} of Pascal's Triangle: {string.Join(", ", result)}");
    }
}
