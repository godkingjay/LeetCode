#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> getRow(int r) {
        vector<int>v(r+1);
        long temp=1;
        v[0]=v[r]=1;
        for(int i=1,up=r,down=1;i<r;i++,up--,down++){
            temp = temp*up/down;
            v[i]=temp;
        }
        return v;
    }
};

int main() {
    int r; cin >> r;
    Solution obb;
    vector<int> vec = obb.getRow(r);

    cout << "[";
    for(int i = 0; i < vec.size();i++) {
        if(i == vec.size() - 1) {
            cout << vec[i] << "]\n";  
        } else {
            cout << vec[i] << ",";  
        }
    }

    return 0;
}
