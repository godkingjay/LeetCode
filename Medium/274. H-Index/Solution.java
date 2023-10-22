class Solution {
    public int hIndex(int[] c) {
        int low=0 , high = c.length;
        while(low < high){
            int mid = (low+high+1)/2;
            int cnt=0;
            for(int i=0 ; i<c.length ; i++) if(c[i] >= mid) cnt++;
            if(cnt >= mid) low = mid;
            else high = high=mid-1;
        }
        return low;
    }
}