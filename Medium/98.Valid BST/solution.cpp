class Solution {
public:
    void check(bool &firsttime, TreeNode* root, int &prev, bool &ans) {
        if (!ans) return;
        if (!root) return;
        check(firsttime, root->left, prev, ans);
        if (root->val <= prev && !firsttime) {ans = false; return;}
        else {prev = root->val; firsttime = false;}
        check(firsttime, root->right, prev, ans);
    }
    bool isValidBST(TreeNode* root) {
        int prev = INT_MIN;
        bool firsttime = true;
        bool ans = true;
        check(firsttime, root, prev, ans);
        return ans;
    }
};