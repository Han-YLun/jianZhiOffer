import java.util.Stack;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que21 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA == null || pushA.length == 0 ||
                popA == null || popA.length == 0 || pushA.length != popA.length){
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {

            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]){

                //出栈
                stack.pop();
                popIndex++;
            }
        }

        

        return stack.isEmpty();

    }
}
