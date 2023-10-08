#include <iostream>
#include <vector>
#include <map> 

using namespace std;

class Solution
{
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> vec;
        int n= floor(nums.size()/3)+1;
        map<int,int> mp;
        map<int,int>::iterator it;    
        for(int i=0;i<nums.size();i++){
            it=mp.find(nums[i]);
            if(it==mp.end())        
                mp.insert(pair<int,int>(nums[i],1));        
            else it->second=mp[nums[i]]+1;        
        } 
        for(it=mp.begin();it!=mp.end();it++){
            if(it->second>=n)        
                vec.push_back(it->first);        
        }
        return vec;   
    }
};

int main()
{

    // call the fn here
    return 0;
}