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
    public int maxDepth(TreeNode root) {
     if(root==null)
     return 0;
     return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
/*   if(root==null){
            return 0;
        }
       Queue<TreeNode> q=new LinkedList<>();
       List<List<Integer>> res=new ArrayList<>();
       q.offer(root);
    
        while(!q.isEmpty()){
       int levelsize=q.size();
         List<Integer> list=new ArrayList<>();
        for(int i=0;i<levelsize;i++){
             
        
        TreeNode current=q.poll();
        list.add(current.val);
        if(current.left!=null){
            q.offer(current.left);
        }
        if(current.right!=null){
            q.offer(current.right);
        }
        }
        res.add(list);
        }
        //System.out.println(res);
       return res.size();*/