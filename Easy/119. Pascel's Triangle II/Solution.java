import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        long temp = 1;
        for(int i=1,up=r,down=1;i<=r;i++,up--, down++){
            temp=temp*up/down;
            ans.add((int)temp);
        }
        return ans;
    }

    public static void main(String args[])throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String str = input.readLine();
        int N = Integer.parseInt(str);

        Solution obb = new Solution();
        List<Integer> li = obb.getRow(N);

        output.write(li+"\n");
        output.flush();
    }
}
