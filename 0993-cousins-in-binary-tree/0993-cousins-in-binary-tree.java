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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
        return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int childCount=0;
        while(!q.isEmpty()){
            int size=q.size();
           
            for(int i=0;i<size;i++){
                  TreeNode temp=q.poll();
                   int sameParentCount=0;
                  if(temp.left!=null){
                    if(temp.left.val==x||temp.left.val==y){
                        childCount++;
                        sameParentCount++;
                    }
                    q.offer(temp.left);
                  }
                   if(temp.right!=null){
                      if(temp.right.val==x||temp.right.val==y){
                        childCount++;
                        sameParentCount++;
                    }
                    q.offer(temp.right);
                  }
                  if(sameParentCount==2){
                    return false;
                  }
            }
            if(childCount==2){
                return true;
            }
            if(childCount==1){
                return false;
            }

        }
        return false;
    }
}