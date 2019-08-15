import java.util.*;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que62 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    //全部遍历,返回一个new的值
    TreeNode KthNode(TreeNode pRoot, int k) {

        if (pRoot == null || k < 1){
            return null;
        }

        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            list.add(node.val);

            if (node.left != null){
                queue.add(node.left);
            }

            if (node.right != null){
                queue.add(node.right);
            }

        }

        if (k > list.size()){
            return null;
        }

        Collections.sort(list);

        return new TreeNode(list.get(k));

    }


    int index = 0;
    //叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。
    TreeNode KthNode1(TreeNode pRoot, int k) {



        if (pRoot != null){
            TreeNode node = KthNode1(pRoot.left, k);
            if (node != null){
                return node;
            }

            index ++;

            if (index == k){
                return pRoot;
            }

            node = KthNode1(pRoot.right,k);
            if (node != null){
                return node;
            }
        }

        return null;

    }

}
