class Solution {
    public int maximumScore(int[] nums, int k) {
        int [] nsr = findNSR(nums);
        int [] nsl = findNSL(nums);
        
        int score =0;
        for(int i=0;i<nums.length;i++){
           int l = nsl[i];
           int r = nsr[i];
           if(l+1 <= k && r-1>= k){
               score = Math.max(score,nums[i] *(r-l-1));
           }
        }
        return score;
    }

//find next smaller element on right 
    public int[] findNSR(int [] arr){
        int [] nsr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] =arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        return nsr;

    }
        //find next smaller element on left 

    public int[] findNSL(int [] arr){
        int [] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] =-1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        return nsl;

    }
}
