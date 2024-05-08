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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();

        if(root==null){
              return list;
        } 
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                if(size==1){
                    list.add(temp.val);
                }
                size--;
            }
        }
        return list;
    }
}