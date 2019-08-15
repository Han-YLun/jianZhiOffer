import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que22 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null){
            return res;
        }

        queue.add(root);

        while (!queue.isEmpty()){

            TreeNode t = queue.poll();
            res.add(t.val);

            if (t.left != null){
                queue.offer(t.left);
            }

            if (t.right != null){
                queue.offer(t.right);
            }
        }

        return res;
    }
}
