import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: hyl
 * @date: 2019/08/18
 **/
public class Que59 {


    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (pRoot == null){
            return res;
        }

        Stack<TreeNode> s1 = new Stack<>();//s1表示奇数,从左到右输出
        Stack<TreeNode> s2 = new Stack<>();//s2表示偶数,从右到左输出

        s1.push(pRoot);

        int level = 1;

        while (!s1.isEmpty() || !s2.isEmpty()){

            ArrayList<Integer> list = new ArrayList<>();

            if ((level & 1) == 1){

                while (!s1.isEmpty()){
                    TreeNode node = s1.pop();
                    if (node != null){
                        list.add(node.val);

                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }


            }else{

                while (!s2.isEmpty()){
                    TreeNode node = s2.pop();

                    if (node != null){
                        list.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }

                }
            }

            if (!list.isEmpty()){
                res.add(list);
                level++;
            }



        }

        return res;

    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(8);
        node.left = new TreeNode(6);
        node.right = new TreeNode(10);

        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(7);

        node.right.left = new TreeNode(9);
        node.right.right = new TreeNode(11);


        new Que59().Print(node);
    }
}
