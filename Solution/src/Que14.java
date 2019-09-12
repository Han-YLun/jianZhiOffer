import java.util.Stack;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {

        if(head == null || k <= 0){
            return null;
        }

        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }

        //判断链表长度是否大于等于长度K
        if (stack.size() < k){
            return null;
        }

        k-= 1;

        while (k-- > 0){
            stack.pop();
        }

        return stack.pop();

    }
}
