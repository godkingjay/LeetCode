#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int i = 0;
        int j = 1;
        int maxProfit = 0; 

        while(j < prices.size()){
            if(prices[i] < prices[j]){
                maxProfit += prices[j] - prices[i];
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }

        return maxProfit;
    }
};

int main() {
    Solution solution;
    vector<int> prices;
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) {
        int price;
        cin >> price;
        prices.push_back(price);
    }

    int result = solution.maxProfit(prices);
    cout << "Maximum profit: " << result << endl;

    return 0;
}
