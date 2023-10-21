class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        int n = cost.size(), bal = 0, start = 0, deficit = 0;

        for(int i = 0; i< n; i++){
            bal += gas[i] - cost[i];

            if(bal < 0){

                deficit += bal;
                start = i+1;
                bal = 0;
            }
        }
        return bal + deficit >= 0 ? start : -1;
    }
};