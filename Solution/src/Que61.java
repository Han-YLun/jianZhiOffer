/**
 * @author: hyl
 * @date: 2019/08/18
 **/
public class Que61 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    //使用前序序列化
    String Serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        if (root == null){
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));

        return sb.toString();

    }


    //使用前序反序列化
    private int index = -1;
    TreeNode Deserialize(String str) {

        index++;

        int len = str.length();
        String[] nodeStr = str.split(",");
        TreeNode node = null;

        if (index >= len){
            return null;
        }

        if (!nodeStr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(nodeStr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }

        return node;
    }

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(5);
        node.right = new TreeNode(6);

        new Que61().Serialize(node);
    }
}
