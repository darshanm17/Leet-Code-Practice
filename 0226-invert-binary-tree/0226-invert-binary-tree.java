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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        swap(root);
        return root;
    }
    public void swap(TreeNode node){
           if(node==null){
            return;
           }
           swap(node.left);
           swap(node.right);
           TreeNode temp=node.left;
           node.left=node.right;
           node.right=temp;
    }
}
/*if(root==null){
            return root;
        }
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        TreeNode current=q.poll();
    
         if(current.left!=null){
            q.add(current.left);
         }
         if(current.right!=null){
            q.add(current.right);
         }
          TreeNode temp=current.left;
            current.left=current.right;
            current.right=temp;
       }
       return root;*/