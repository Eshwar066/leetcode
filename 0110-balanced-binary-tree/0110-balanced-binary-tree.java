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
    public boolean isBalanced(TreeNode root) {
        return isBalanced1(root)!=-1;
    }
    int isBalanced1(TreeNode root){
        
        if(root==null){
            return 0;
        }
        int lh=isBalanced1(root.left);
        int rh=isBalanced1(root.right);
        
        if(lh==-1 || rh==-1)return -1;
        if(Math.abs(lh-rh)>1) return -1;
        
        return 1+Math.max(lh,rh);
    }
}