public class Solution {
    public int countNodes(TreeNode root) {
        int count = 1;  //Root itself should be counted
        if (root ==null) {
            return 0;
			}
        else {
            count += countNodes(root.left);
            count += countNodes(root.right);
            return count;
        }   
    }
    
}
