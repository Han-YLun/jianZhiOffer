import java.util.LinkedList;

/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que46 {

    public int LastRemaining_Solution(int n, int m) {

        if (n == 0 || m == 0){
            return -1;
        }

        //记录第m个在数组中的位置
        int  index = 0;

        int[] quit = new int[n];
        //默认为1,即所有人都没有退出
        for (int i = 0; i < n; i++) {
            quit[i] = 1;
        }
        while (true){

            int sum = 0;

            //查数到m
            int tempM = m;
            while (tempM-- != 0){

                //当当前为已退出,tempM加加
                if (quit[index % n] != 1){
                    tempM++;
                }


                //下标前移
                index++;
                
            }

            //将此位退出的标志即为0
            quit[(index - 1) % n] = 0;
            


            //判断没有退出的有多少个
            for (int i = 0; i < quit.length; i++) {
                if (quit[i] == 1){
                   sum++;
                }
            }

            //如果只有一个,结束循环
            if (sum == 1){
                break;
            }
        }

        for (int i = 0; i < quit.length; i++) {
            if (quit[i] != 0){
                return i;
            }
        }

        return -1;

    }


    public int LastRemaining_Solution1(int n, int m) {

        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        while (list.size() > 1){
             index = (index + m - 1) % list.size();
             list.remove(index);
        }

        return list.size() == 1 ? list.get(0) : -1;

    }




    public static void main(String[] args) {
        System.out.println(new Que46().LastRemaining_Solution(3,2));
    }
}
