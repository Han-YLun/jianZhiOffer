/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que13 {

    public void reOrderArray(int [] array) {


        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] % 2 == 1; j--) {

                if (array[j-1] % 2 == 0){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}
