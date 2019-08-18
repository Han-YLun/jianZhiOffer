/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que39 {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }


    /**
     * 遍历每个结点，借助一个获取树深度的递归函数，
     * 根据该结点的左右子树高度差判断是否平衡，然后递归地对左右子树进行判断。
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {

        if (root == null){
            return true;
        }

        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1
                        && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }

    private int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
        
    }




}
