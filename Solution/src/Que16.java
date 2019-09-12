/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {

        ListNode head = new ListNode(0);

        ListNode p = head;



        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }


        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;

            } else{
                p.next = list2;
                list2 = list2.next;
            }
            
            p = p.next;
        }

        if(list1!=null){
            p.next = list1;
        }
        if(list2!=null){
            p.next = list2;
        }
        head = head.next;

        return head;

    }
}
      