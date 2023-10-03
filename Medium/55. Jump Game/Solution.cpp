class Solution {
public:
//checking right to left if the current position can reach the last index
    bool canJump(vector<int>& nums) {
        int minjump=0;
        for(int i=nums.size()-2; i>=0; i--) {
            minjump++;
            if(nums[i]>=minjump) 
                minjump=0;
        }
        return !minjump; 
    }
};