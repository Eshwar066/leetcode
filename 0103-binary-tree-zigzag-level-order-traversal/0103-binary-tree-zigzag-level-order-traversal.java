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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean isLeftToRight=true;
        while(!q.isEmpty()){
            
           int level=q.size();
            List<Integer> subList=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode temp=q.poll();
                subList.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }         
            }
            
            if(!isLeftToRight){
                    Collections.reverse(subList);
                } 
                
                result.add(subList);
                isLeftToRight=!isLeftToRight;
            
        }
        return result;
    }
}