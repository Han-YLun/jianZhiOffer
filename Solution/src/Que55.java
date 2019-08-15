/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que55 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return null;
        }


        ListNode fastNode = pHead;
        ListNode slowNode = pHead;

        while (fastNode != null && slowNode != null){

            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (slowNode == fastNode){
                fastNode = pHead;
                while (fastNode != slowNode){
                    fastNode = fastNode.next;
                    slowNode = slowNode.next;
                }
                return fastNode;
            }
        }


        return null;

    }
}
