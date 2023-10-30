class Solution {
    public String convert(String s, int numRows) {
        if(numRows < 2)
        {
            return s;
        }
        String str ="";
        int x = s.length();
        
        char ans[][] = new char[numRows][x];
        for(int i = 0 ; i < numRows; i++)
        {
            for(int j = 0; j < x; j++)
            {
               ans[i][j] = '&';
            }
        }
        for(int i = 0, changer = 1, row = 0; i < s.length(); i++)
        {
            ans[row][i] = s.charAt(i);
            if(row == numRows - 1)
            {
                changer = -1;
            }
            if(row == 0)
            {
                changer = 1;
            }
            row = row + changer;
        }
         for(int i = 0 ; i < numRows; i++)
        {
            for(int j = 0; j < x; j++)
            {
               if(ans[i][j] != '&')
               {
                   str = str + ans[i][j];
               }
            }
        }
        
        return str;
       
}
}
