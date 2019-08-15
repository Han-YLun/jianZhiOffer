import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que29 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {


        ArrayList<Integer> resList = new ArrayList<>();
        if (input == null || input.length == 0 || k <= 0 || k > input.length ){

            return resList;
        }

        Arrays.sort(input);

        for (int i = 0; i < k; i++) {

            resList.add(input[i]);
        }

        return resList;

    }
}
