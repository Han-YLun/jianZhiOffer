import com.sun.org.apache.xpath.internal.operations.Mod;
import sun.security.provider.MD2;

/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que35 {

    private final int MOD = 1000000007;

    public int InversePairs(int [] array) {

        if (array == null || array.length == 0){
            return 0;
        }

        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        int count = getInversePairs(array , copy , 0 , array.length - 1);

        return count;


    }

    private int getInversePairs(int[] array, int[] copy, int low, int high) {

       if (low == high){
           return 0;
       }

       int mid = low + (high - low) / 2;
       int leftCount = getInversePairs(array , copy , low , mid) % MOD;
       int rightCount = getInversePairs(array , copy , mid + 1 , high) % MOD;

       int count = 0;

       int i = mid , j = high;
       int indexCopy = high;


       while (i >= low && j > mid){
           if (array[i] > array[j]){
               count += (j - mid) ;
               copy[indexCopy--] = array[i--];

               count %= MOD;
               
           }else{
               copy[indexCopy--] = array[j--];
           }
       }

        for (; i >= low ; i--) {
            copy[indexCopy--] = array[i];
        }

        for (; j > mid ; j--) {
            copy[indexCopy--] = array[j];
        }

        for (int k = low; k <= high ; k++) {
            array[k] = copy[k];
        }

        
        return (leftCount + rightCount + count) % MOD;
    }

    public static void main(String[] args) {
        new Que35().InversePairs(new int[]{7,6,4,5});
    }
}
