/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que15 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }


        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next = cur.next;

        while (cur != null) {

            cur.next = prev;
            prev = cur;

            cur = next;
            if (next != null){
                next = next.next;
            }


        }

        head.next = null;
        head = prev;


        return head;

    }
}
