/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        Map<Integer, Integer> map = new HashMap<>();
        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                sum += temp.val;
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);

            }
            map.put(level, sum);
            level++;
        }
        int maxsum=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> me:map.entrySet()){
            if(me.getValue()==maxsum){
                return me.getKey();
            }
        }
        return 0;
    }
}