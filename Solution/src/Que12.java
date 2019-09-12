/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que12 {

    public double Power(double base, int exponent) {

        if (base == 0.0){
            return 0;
        }

        double res = 1.0;
        for (int i = exponent; i != 0 ; i >>= 1) {

            
            if (exponent % 2 != 0){
                res *= base;
            }

            base *= base;

        }

        return exponent < 0 ? 1 / res : res;
    }
}
