import java.util.Arrays;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que28 {

    public int MoreThanHalfNum_Solution(int [] array) {


        Arrays.sort(array);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length / 2]){
                count++;
            }
        }
        return count >= (array.length / 2) ? count : 0;

    }
}
