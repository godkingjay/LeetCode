/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] arr) {

      return   createBST(arr, 0,arr.length-1);
    }
    public static TreeNode createBST(int arr[], int si, int end){
          if(si> end){
            return null;
        }
        int mid=(si+end)/2;
        TreeNode root= new TreeNode(arr[mid]);
        root.left= createBST(arr, si, mid-1);
        root.right= createBST(arr, mid+1, end);
        return root;

    }
}
