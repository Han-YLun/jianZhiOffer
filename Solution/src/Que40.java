import java.util.Map;
import java.util.TreeMap;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que40 {


    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        Map<Integer,Integer> map = new TreeMap<>();

        int a = 0, b = 0;
        for (int i = 0; i < array.length; i++) {

            map.put(array[i],map.getOrDefault(array[i],0) + 1);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1){
                if (a != 0){
                    b = integerIntegerEntry.getKey();
                }else{
                    a = integerIntegerEntry.getKey();
                }
            }
        }

        num1[0] = a;
        num2[0] = b;



    }
}
