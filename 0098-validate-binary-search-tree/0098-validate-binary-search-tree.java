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
    public boolean isValidBST(TreeNode root) {
      return rec(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean rec(TreeNode root,long lb,long rb){
        if(root==null)
        return true;
        if(root.val<=lb || root.val>=rb){
            return false;
        }
        return rec(root.left,lb,root.val) && rec(root.right,root.val,rb);
    }

}