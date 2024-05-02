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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        boolean flag = true;
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(queue.peek().val);

                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                queue.poll();
            }
            if(!flag){
                Collections.reverse(temp);
            }
            ans.add(temp);
            flag = !flag;
        }
        return ans;
}
}
/* List<List<Integer>> ans=new ArrayList<>();
        //List<Integer> list=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    private void helper(TreeNode node,List<List<Integer>> ans){
        if(node==null){
            return;
        }
        int h=height(node);
        boolean ltr=false;
        for(int i=0;i<=h;i++){
            List<Integer> list=new ArrayList<>();
            zigzagrecursive(node,i,ltr,list);
            ltr=!ltr;
            ans.add(list);
        }
    }
    private void zigzagrecursive(TreeNode node,int level,boolean ltr,List<Integer> list){
        if(node==null)
        {
            return;
        }
        if(level==1){
            list.add(node.val);
        }
        else if(level>1){
            if(ltr!=false){
                zigzagrecursive(node.left,level-1,ltr,list);
                zigzagrecursive(node.right,level-1,ltr,list);
            }
            else{
                zigzagrecursive(node.right,level-1,ltr,list);
                zigzagrecursive(node.left,level-1,ltr,list);
            }
        }
    }
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }*/