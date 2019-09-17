/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que38 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //二叉树的最长深度
    public int TreeDepth(TreeNode root) {
        if (root == null ){
            return 0;
        }

        return Math.max(TreeDepth(root.left)  , TreeDepth(root.right))+1;
    }
}
