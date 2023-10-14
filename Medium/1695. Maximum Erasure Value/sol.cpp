class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int ans = 0, n = nums.size();
        unordered_map<int, int> data;   // storing 1-base index of each element
        
        int sum = 0, l = 0; // l holds the starting index of the current sub-array
        for (int r=0; r<n; r++) {
            if (data[nums[r]]==0) {
                data[nums[r]] = r+1;
                sum += nums[r];
            }
            else {
                int toSubtract = 0, newL = data[nums[r]];
                for (int i=l; i<data[nums[r]]; i++) {
                    // deleting the sum of elements till the previous occurance of rth (current) element, and marking them unvisited.
                    toSubtract += nums[i];
                    data[nums[i]] = 0;
                }
                l = newL;
                sum -= toSubtract;
                data[nums[r]] = r+1;
                sum += nums[r];
            }
            ans = max(ans, sum);
        }

        return ans;
    }
};

