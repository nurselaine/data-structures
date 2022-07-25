public class countLeftNodes {
    private IntTreeNode overallRoot;
    private int size = 0;

    public int countEmpty(){
        return helper(overallRoot);
    }

    public int helper(IntTreeNode overallRoot){
        if(root == null){
            return 1;
        }

        if(root.left != null){
            helper(root.left);
        } else if (root.left == null){
            this.size++;
        }

        if(root.right != null){
            helper(root.right);
        } else if (root.right == null){
            this.size++;
        }
    }
}