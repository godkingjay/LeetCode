#include <iostream>
#include <vector>
#include <deque>
#include <algorithm>
using namespace std;

class Solution
{
public:
    int constrainedSubsetSum(vector<int> &nums, int k)
    {
        vector<int> dp(nums);
        deque<int> q;
        q.push_back(0);
        for (int i = 1; i < nums.size(); i++)
        {
            while (!q.empty() && q.back() < i - k)
            {
                q.pop_back();
            }
            dp[i] = max(dp[i], dp[q.back()] + nums[i]);
            while (!q.empty() && dp[q.front()] <= dp[i])
            {
                q.pop_front();
            }
            q.push_front(i);
        }
        return *max_element(dp.begin(), dp.end());
    }
};