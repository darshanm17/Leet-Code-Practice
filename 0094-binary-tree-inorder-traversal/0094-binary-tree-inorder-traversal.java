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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
         
       return inorderRecursive(root,list);
    }
    private List<Integer> inorderRecursive(TreeNode current,List<Integer> list){
      if(current!=null){
            inorderRecursive(current.left,list);
           list.add(current.val);
           inorderRecursive(current.right,list);
        }
        return list;
    }
}