import javax.swing.tree.TreeNode;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que4 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //根据前序和中序构造二叉树
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        TreeNode root = reConstruct(pre , 0 , pre.length - 1 ,
                in , 0 , in.length - 1);

        return root;

    }

    private TreeNode reConstruct(int[] pre, int startPre, int endPre,
                                 int[] in, int startIn, int endIn) {

        if ( startPre > endPre || startIn > endIn){
            return null;
        }

        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]){

                root.left = reConstruct(pre , startPre + 1 , startPre + i - startIn ,
                        in , startIn , i - 1);

                root.right = reConstruct(pre , startPre + i - startIn + 1 , endPre ,
                        in , i + 1 , endIn);

                break;
            }
        }

        return root;
    }
}
