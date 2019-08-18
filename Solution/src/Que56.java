/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que56 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null){
            return pHead;
        }

        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode p = pHead;

        //指向前一个节点
        ListNode preNode = first;

        while (p != null && p.next != null){
            if (p.val == p.next.val){
                int val = p.val;

                while (p != null && p.val == val){
                    p = p.next;
                }

                preNode.next = p;
            }  else{
                preNode = p;
                p = p.next;
            }
        }

        return first.next;
    }
}
