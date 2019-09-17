import java.util.ArrayList;

/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que41 {



    /**
     * 穷举暴力求解
     * 时间复杂度为O(N^N)
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {



        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if (sum <= 0){
            return res;
        }

        for (int i = 1; i <= sum ; i++) {


            int tSum = 0;
            for (int j = i; j <= sum  ; j++) {

                //当i+j超过了sum 没必要向下求解了,保证解至少是两个数
                if (i + j > sum){
                    break;
                }
                tSum += j;

                if (tSum > sum){
                    break;
                }else if(tSum == sum){

                    list = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        list.add(k);
                    }

                    res.add(list);

                }
            }
        }

        return res;

    }


    /**
     * 使用两个指针进行移动,类似于两数之和/三数之和
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence1(int sum) {



        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if (sum < 3){
            return res;
        }

        int start = 1;
        int end = 2;

       while (start < ((sum+1) / 2)){

           int s = 0;

           for (int i = start; i <= end ; i++) {
               s += i;
           }

           if (s == sum){
               for (int i = start; i <= end ; i++) {
                   list.add(i);
               }

               res.add(new ArrayList<>(list));
               list.clear();
               start++;
           }else{
               if (sum > s){
                    end++;
               }else{
                   start++;
               }
           }
       }


       return res;

    }
    public static void main(String[] args) {
        new Que41().FindContinuousSequence1(3);
    }
}
