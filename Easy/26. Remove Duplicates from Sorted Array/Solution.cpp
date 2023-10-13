#include <vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int c = 0;
        if (nums.size() == 0) {
            return 0;
        }
        for (int i = 0; nums[i] != nums[nums.size() - 1]; i++) {
            int curElm = nums[i], nuOfA = 0, pos = i + 1;
            while (pos < nums.size()) {
                if (curElm == nums[pos]) {
                    nuOfA++;
                } else {
                    break;
                }
                pos++;
            }
            if (nuOfA > 0) {
                shiftByNum(nums, nuOfA, i);
            }
            c++;
        }
        
        return c + 1;
    }

private:
    void shiftByNum(vector<int>& nums, int by, int pos) {
        for (int i = pos; i + by < nums.size(); i++) {
            nums[i] = nums[i + by];
        }
    }
};

