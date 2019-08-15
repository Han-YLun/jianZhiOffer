/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que6 {

    public int minNumberInRotateArray(int [] array) {

        if (array == null || array.length == 0){
            return 0;
        }

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[i-1]){
                return array[i];
            }
        }

        return 0;

    }
}
