/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que7 {

    public int Fibonacci(int n) {

        if (n <= 0){
            return 0;
        }

        int[] fib = new int[41];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i <= 40; i++) {
            fib[i] = fib[i-1] + fib[i - 2];
        }

        return fib[n];
    }
}
