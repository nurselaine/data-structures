/*
Write a method countEvenBranches that returns the number of branch nodes in a binary tree that contain even numbers.
A branch node is one that has one or two children (i.e., not a leaf node). An empty tree has 0 even branches
*/

public class intTree{
    private IntTreeNode overallRoot;
    private evenBranchNodes = 0;

    public int countEvenBranches(overallRoot){
        return helper(overallRoot);
    }

    public int helper(IntTreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left != null || root.right != null){
            if(root.data % 2 == 0){
                this.evenBranchNodes++;
            } else {
                return 0;
            }

            if(root.left != null){
                helper(root.left);
            }
            if(root.right != null){
                helper(root.right);
            }
            return this.evenBranchNodes;
        }
    }
}