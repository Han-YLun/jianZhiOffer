import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que60 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        ArrayList<Integer> tmpList = new ArrayList<>();

        int now = 1 , next = 0;

        if (pRoot == null){
            return res;
        }

        queue.add(pRoot);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            now--;
            tmpList.add(node.val);

            if (node.left != null){
                queue.add(node.left);
                next++;
            }


            if (node.right != null){
                queue.add(node.right);
                next++;
            }

            if (now == 0){
                res.add(tmpList);
                now = next;
                next = 0;
                tmpList = new ArrayList<>();
            }
        }




        for (ArrayList<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer + "");
            }

            System.out.println();
        }
        return res;
    }
}
