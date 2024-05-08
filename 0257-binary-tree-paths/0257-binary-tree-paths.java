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
        List<String> ans=new ArrayList<String>();
        if(root!=null)
        findPaths(root,"",ans);
        return ans;
            }
    private void findPaths(TreeNode node,String path,List<String> ans){
        if(isLeaf(node)){
            ans.add(path+node.val);
        }
        if(node.left!=null){
            findPaths(node.left,path+node.val+"->",ans);
        }
        if(node.right!=null){
            findPaths(node.right,path+node.val+"->",ans);
        }

    }
    private boolean isLeaf(TreeNode node){
      if(node.left==null && node.right==null){
        return true;
      }
      return false;
    }
}