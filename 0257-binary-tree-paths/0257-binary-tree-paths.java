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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root!=null){
            path(res,root,""); 
        }
        return res;
    }
    private void path(List<String> res,TreeNode root,String curr){
        if(root.left==null && root.right==null){
             res.add(curr+Integer.toString(root.val));    
        }else{
            if(root.left!=null){
                path(res,root.left,curr+Integer.toString(root.val)+"->");
            }
            if(root.right!=null){
                 path(res,root.right,curr+Integer.toString(root.val)+"->");
            }
        }
    }
}