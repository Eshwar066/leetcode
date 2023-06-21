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
    int maximum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // if(root==null || root.left==null || root.right==null) return root.val;
        if(root.val<0 && (root.left==null && root.right==null))return root.val;
          max(root);
        return maximum;
        
    }
    public int max(TreeNode root){
        if(root==null)return 0;
        
        int left=Math.max(0,max(root.left));
        int right=Math.max(0,max(root.right));
        
         maximum=Math.max(maximum,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}