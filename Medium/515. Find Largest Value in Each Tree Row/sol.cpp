class Solution
{
public:
    vector<int> largestValues(TreeNode *root)
    {
        if (!root)
            return {};

        std::vector<int> result;
        std::queue<TreeNode *> queue;
        queue.push(root);

        while (!queue.empty())
        {
            int curr_level_size = queue.size();
            int max_val = INT_MIN;

            for (int i = 0; i < curr_level_size; ++i)
            {
                TreeNode *node = queue.front();
                queue.pop();
                max_val = std::max(max_val, node->val);

                if (node->left)
                    queue.push(node->left);
                if (node->right)
                    queue.push(node->right);
            }

            result.push_back(max_val);
        }

        return result;
    }
};
