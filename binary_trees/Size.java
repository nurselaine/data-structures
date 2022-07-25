public class Size  {
    private IntTreeNode overallRoot;
    private int size = 1;

    public int size(){
        return helper(this.overallRoot);
    }

    public int helper(IntTreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left != null){
            this.size++;
            helper(root.left);
        }

        if(root.right != null){
            this.size++;
            helper(root.right);
        }

        return this.size;
    }
}