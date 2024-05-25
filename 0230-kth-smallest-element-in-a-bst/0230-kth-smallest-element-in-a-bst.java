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
    int count=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
          rec(root,k);
          return ans;
    }
    private void rec(TreeNode node,int k){
        if(node.left!=null){
        rec(node.left,k);
     
        }
           count++;
        if(count==k){
            ans=node.val;
            return;
        }
        if(node.right!=null){
            rec(node.right,k);
        }
    }
}