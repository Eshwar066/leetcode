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
        private List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
         Traverse(root);
        return res;
    }
    private void  Traverse(TreeNode root){
        if(root==null){
            return;
        }
        
         res.add(root.val);
         Traverse(root.left);
        
          Traverse(root.right);
    }
    }


