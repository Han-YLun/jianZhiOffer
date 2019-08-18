import jdk.nashorn.internal.ir.WhileNode;

/**
 * @author: hyl
 * @date: 2019/08/18
 **/
public class Que57 {


    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        if (pNode == null){
            return null;
        }

        //如果有右子树，则找右子树的最左节点
        if (pNode.right != null){
            pNode = pNode.right;

            while (pNode.left != null){
                pNode = pNode.left;
            }

            return pNode;
        }

        while (pNode.next != null){

            //找到第一个当前节点是父节点的左孩子的节点
            if (pNode.next.left == pNode){
                return pNode.next;
            }

            pNode = pNode.next;
        }

        //退到了根节点仍没找到，则返回null
        return null;

    }
}
