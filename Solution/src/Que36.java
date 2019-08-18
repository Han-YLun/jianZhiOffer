import java.util.HashMap;

/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que36 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    /**
     * 利用HashMap进行存储
     * 时间复杂度为O(N),空间复杂度为O(N)
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode node1 = pHead1;
        ListNode node2 = pHead2;

        HashMap<ListNode,Integer> map = new HashMap<>();

        while (node1 != null){
            map.put(node1,null);
            node1 = node1.next;
        }


        while (node2 != null){
            if (map.containsKey(node2)){
                return node2;
            }
            node2 = node2.next;
        }

        return null;

    

    }


    /**
     * 用两个指针扫描”两个链表“，最终两个指针到达 null 或者到达公共结点
     * 时间复杂度为O(N),空间复杂度为O(1)
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {

        ListNode node1 = pHead1;
        ListNode node2 = pHead2;



        while (node1 != node2){
            node1 = (node1 != null ? node1.next : pHead2);
            node2 = (node2 != null ? node2.next : pHead1);
        }

        return node1;



    }


}
