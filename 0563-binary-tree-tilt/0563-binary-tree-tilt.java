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
    int sum;
    public int findTilt(TreeNode root) {
        if(root==null)
        return 0;
        dfs(root);
        return sum;
    }
    private int dfs(TreeNode root){
        if(root==null)
        return 0;
        int ls=dfs(root.left);
        int rs=dfs(root.right);
        sum+=Math.abs(ls-rs);
        return ls+rs+root.val;
    }
}