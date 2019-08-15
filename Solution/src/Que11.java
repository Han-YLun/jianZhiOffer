/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que11 {

    public int NumberOf1(int n) {

        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){
            return 1;
        }

        if (n < 0){
            n = ~n;
            n += 1;
        }

        System.out.println(n);
        int sum = 0;
        while(n > 0){
            if((n & 1) == 1){
                sum++;

            }
            n /= 2;
        }

        return sum;
    }
}
