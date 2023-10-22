#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n = cost.size();
        
        for (int i = 2; i < n; i++) {
            cost[i] += min(cost[i - 1], cost[i - 2]);
        }
        
        return min(cost[n - 1], cost[n - 2]);
    }
};

int main() {
    int n;
    cout << "Enter the number of steps: ";
    cin >> n;

    vector<int> cost(n);

    cout << "Enter the cost for each step:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> cost[i];
    }

    Solution solution;
    int result = solution.minCostClimbingStairs(cost);

    cout << "Minimum cost to reach the top: " << result << endl;

    return 0;
}
