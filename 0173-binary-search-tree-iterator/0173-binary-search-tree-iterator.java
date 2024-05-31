class BSTIterator {
    TreeNode cur;
    Stack<Integer> st;
    public BSTIterator(TreeNode root) {
        cur=root;
        st=new Stack<>();
        dfs(cur);
    }
    
    public int next() {
        return st.pop();
    }
    
    public boolean hasNext() {
        if(st.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.right);
        st.push(root.val);
        dfs(root.left);
        
    }
}