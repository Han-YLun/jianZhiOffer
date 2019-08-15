import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que64 {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {

        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length == 0 || size < 1){
            return res;
        }

        LinkedList<Integer> queue = new LinkedList<>();


        for (int i = 0; i < num.length; i++) {

            while (!queue.isEmpty() && num[queue.peekLast()] < num[i]){
                queue.pollLast();
            }

            queue.addLast(i);


            //如果不是首次窗口,依次移除第一个
            if (queue.peek() <= (i - size)){
                queue.poll();
            }

            //当窗口长度为大于size,保存结果
            if (i+1 >= size){
                res.add(num[queue.peek()]);
            }
        }


        return res;

    }
}
