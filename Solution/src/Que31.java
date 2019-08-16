/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que31 {


    //暴力,时间复杂度为O(N)
    public int NumberOf1Between1AndN_Solution(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getTheOneInNumber(i);
        }

        return sum;
    }

    private int getTheOneInNumber(int num) {

        int n = num;
        int sum = 0;
        while (n != 0){
            if (n % 10 == 1){
                sum ++;
            }

            n /= 10;
        }

        return sum;
    }
}
