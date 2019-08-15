

import javafx.scene.transform.Rotate;
import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que24 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    private ArrayList<ArrayList<Integer>> resAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {


        if (root == null){
            return resAll;
        }

        list.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null){
            resAll.add(list);
        }

        FindPath(root.left , target);
        FindPath(root.right , target);

        list.remove(list.size() - 1);


        return resAll;

        
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        new Que24().FindPath(root,11);
    }
}
