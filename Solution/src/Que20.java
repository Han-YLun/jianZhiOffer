import java.util.Stack;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que20 {

    Stack<Integer> stack = new Stack<>();

    //保存最小值
    Stack<Integer> minStack = new Stack<>();


    public void push(int node) {

        stack.push(node);

        if (minStack.isEmpty()){
            minStack.push(node);
        }else if (node < minStack.peek()){
            minStack.push(node);
        }


    }

    public void pop() {

        if (stack.peek() == minStack.peek()){
            stack.pop();
            minStack.pop();
        }else{
            stack.pop();
        }


    }

    public int top() {

        return stack.peek();

    }

    public int min() {

        return  minStack.peek();
    }
}
