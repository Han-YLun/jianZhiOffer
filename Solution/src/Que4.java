import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.Collections;

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

       if (pre == null || in == null){
           return null;
       }

       if (pre.length == 0 || in.length == 0){
           return null;
       }

       if (pre.length != in.length){
           return null;
       }

       TreeNode root = new TreeNode(pre[0]);

       for (int i = 0; i < pre.length; i++) {
           if (pre[0] == in[i]){

               root.left = reConstructBinaryTree(Arrays.copyOfRange(pre , 1 , i + 1),
                        Arrays.copyOfRange(in , 0 , i));

               root.right = reConstructBinaryTree(Arrays.copyOfRange(pre , i + 1 , pre.length),
                        Arrays.copyOfRange(in , i + 1 , in.length));

            }
        }

        return root;
    }
}
