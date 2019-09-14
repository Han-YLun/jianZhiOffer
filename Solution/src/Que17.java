import java.util.ArrayList;
import java.util.List;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que17 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    /**
     * 判断root2是否为root1的子结构
     * 时间复杂度 ： O(N),空间复杂度 ： O(N)
     * @param root1
     * @param root2
     * @return root2是否为root1的子结构
     */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if (root2 == null || root1 == null){
            return false;
        }

        List<Integer> root1List = new ArrayList<>();

        List<Integer> root2List = new ArrayList<>();

        getTreeNode(root1List,root1);

        getTreeNode(root2List,root2);

        if (root1List.containsAll(root2List)){
            return true;
        }

        return false;

    }

    private void getTreeNode(List<Integer> root1List, TreeNode root1) {

        if (root1 == null){
            return;
        }

        root1List.add(root1.val);

        if (root1.left != null){
            getTreeNode(root1List,root1.left);
        }

        if (root1.right != null){
            getTreeNode(root1List,root1.right);
        }

    }
}
