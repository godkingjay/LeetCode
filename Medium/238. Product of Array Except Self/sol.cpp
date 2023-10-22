#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    vector<int> productExceptSelf(vector<int> &nums)
    {
        vector<int> answer;
        int m = 1;
        int m1 = 1;
        int count = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            answer.push_back(nums[i]);
            if (nums[i] != 0)
            {
                m = m * nums[i];
                m1 = m1 * nums[i];
            }
            else
            {
                m = m * nums[i];
                count++;
            }
        }
        for (int i = 0; i < nums.size(); i++)
        {
            if (count > 1)
            {
                answer[i] = 0;
            }
            else if (nums[i] == 0)
            {
                answer[i] = m1;
            }
            else
                answer[i] = m / nums[i];
        }
        return answer;
    }
};

int main()
{

    // call the fn here
    return 0;
}