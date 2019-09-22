import java.util.ArrayList;

/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que51 {


    /**
     * B[i] = A[0] * ... * A[N-1],除了A[i]变为1
     * 时间复杂度为O(N^N)
     * @param A
     * @return
     */
    public int[] multiply(int[] A) {

        int[] B = new int[A.length];
        

        for (int i = 0; i < B.length; i++) {

            int sum = 1;

            for (int j = 0; j < A.length; j++) {

                if (i != j){
                    sum *= A[j];
                }

            }

            B[i] = sum;
        }

        return B;

    }


    /**
     * 先求出下三角,再求出上三角
     * 时间复杂度为O(N)
     * @param A
     * @return
     */
    public int[] multiply1(int[] A) {

        int len = A.length;
        int[] B = new int[A.length];

        if (len != 0){
            B[0] = 1;

            //计算下三角连乘
            for (int i = 0; i < len; i++) {
                B[i] = B[i-1] * A[i-1];
            }

            int temp = 1;
            
            //计算下三角
            for (int i = len - 2; i >= 0; --i) {

                temp *= A[i+1];
                B[i] *= temp;
            }
        }

        return B;

    }
}
