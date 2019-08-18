/**
 * @author: hyl
 * @date: 2019/08/18
 **/
public class Que58 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    boolean isSymmetrical(TreeNode pRoot) {

        if (pRoot == null){
            return true;
        }

        return isCommon(pRoot.left,pRoot.right);

    }

    private boolean isCommon(TreeNode left, TreeNode right) {

        if (left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        return (left.val == right.val) && isCommon(left.left,right.right) && isCommon(left.right,right.left);
    }
}
