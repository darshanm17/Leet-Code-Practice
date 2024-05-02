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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
       return solver(root.left,root.right);
       
    }
    private boolean solver(TreeNode leftnode,TreeNode rightnode){
       if(leftnode==null && rightnode==null){
        return true;
       }
       if(leftnode==null || rightnode==null){
        return false;
       }
       return leftnode.val==rightnode.val && solver(leftnode.left,rightnode.right) && solver(leftnode.right,rightnode.left);
    }
}