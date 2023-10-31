class Solution {
public:
    vector<int> findArray(vector<int>& pref) {
        int n = pref.size();
        vector<int> arr(n);

        arr[0] = pref[0]; // The first element of arr is equal to the first element of pref

        // Iterate through the pref array to find the elements of arr
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }

        return arr;
    }
};
