import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 * @author: hyl  
 * @date: 2019/08/15
 **/
public class Que3 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }


    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> resList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while (listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()){
            resList.add(stack.pop());
        }

        return resList;
    }

    
}

