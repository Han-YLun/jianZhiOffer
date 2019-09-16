/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que26 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }


    TreeNode head = null , realHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        convert(pRootOfTree);
        return realHead;
    }

    private void convert(TreeNode root) {

        if (root == null){
            return;
        }

        convert(root.left);

        if (head == null){
            head = root;
            realHead = root;
        }else{
            head.right = root;
            root.left = head;
            head = root;
        }

        convert(root.right);

        
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);

        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);


        Que26 que26 = new Que26();
        que26.Convert(treeNode);

    }

}
