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
}
