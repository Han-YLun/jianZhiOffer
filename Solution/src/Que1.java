/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que1 {

    public boolean Find(int target, int[][] array) {

        if (array == null || array[0].length == 0){
            return false;
        }
    

        for (int i = 0; i < array.length; i++) {

            if (target <= array[i][array[0].length - 1] && target <= array[i][0]) {
                for (int j = 0; j < array[0].length; j++) {
                    if (target == array[i][j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
