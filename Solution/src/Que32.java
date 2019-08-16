import java.util.*;

/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que32 {

    public String PrintMinNumber(int [] numbers) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = "" + o1 + o2;
                String s2 = "" + o2 + o1;
                return s1.compareTo(s2);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (Integer integer : list) {
            sb.append(integer);
        }

        System.out.println(sb.toString());

        return sb.toString();

    }


    public static void main(String[] args) {
        new Que32().PrintMinNumber(new int[]{1,2,3,4,5});
    }

    
}
