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
    public int sumNumbers(TreeNode root) {
       List<String> list=new ArrayList<>();
       if(root!=null){
        findpath(root,"",list);
       }
      // System.out.println(list);
       int ans=0;
       for(int i=0;i<list.size();i++){
        ans+=Integer.parseInt(list.get(i));
       }
       return ans;
    }
    private void findpath(TreeNode node,String path,List<String> list){
        if(isLeaf(node)){
            list.add(path+node.val);
        }
        if(node.left!=null){
        findpath(node.left,path+node.val+"",list);
        }
        if(node.right!=null){
            findpath(node.right,path+node.val+"",list); 
        }

    }
    private boolean isLeaf(TreeNode node){
        if(node.left==null&& node.right==null)
        return true;
        return false;
    }
}