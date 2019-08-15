/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que30 {

    public int FindGreatestSumOfSubArray(int[] array) {

        int res = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {

            max = Math.max(max + array[i] , array[i]);
            res = Math.max(max , res);
        }

        return max;

    }
}
