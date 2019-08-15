/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que18 {


    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode root) {

        if (root != null){
            mirror(root);
        }

    }

    private void mirror(TreeNode root) {

        if (root != null){

            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;

            mirror(root.left);
            mirror(root.right);
        }
    }
}
