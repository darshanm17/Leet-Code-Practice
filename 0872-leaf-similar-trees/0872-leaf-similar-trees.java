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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        add(root1,list1);
        add(root2,list2);
        return list1.equals(list2);

    }
    private void add(TreeNode node,List<Integer> list){
        if(node==null)
        return;
        add(node.left,list);
        if(node.left==null && node.right==null){
            list.add(node.val);
        }
        add(node.right,list);
        return;
        
    }
}