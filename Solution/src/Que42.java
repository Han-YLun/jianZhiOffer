import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que42 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> resList = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }


        for (int i = 0; i < array.length; i++) {
            int temp = sum - array[i];
            if (map.containsKey(temp)){

                resList.add(array[i]);
                resList.add(temp);
                break;
            }

        }

        return resList;



    }
}
