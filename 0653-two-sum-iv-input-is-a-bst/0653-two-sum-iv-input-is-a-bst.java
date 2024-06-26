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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int start=0,end=list.size()-1;
        while(start<end){
            int sum=list.get(start)+list.get(end);
            if(sum==k)
            return true;
            else if(sum<k)
            start++;
            else
            end--;
        }
        return false;

    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
        return;
    }
}