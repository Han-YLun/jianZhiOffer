import java.util.ArrayList;
import java.util.List;


/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que33 {

    public int GetUglyNumber_Solution(int index) {

        //前6个丑数分别是0-6
        if (index < 7){
            return index;
        }

        List<Integer> res = new ArrayList<>();
        res.add(1);

        int i2 = 0 , i3 = 0, i5 = 0;

        while ((res.size() - 1) < index){

            int m2 = res.get(i2) * 2;
            int m3 = res.get(i3) * 3;
            int m5 = res.get(i5) * 5;

            int min = Math.min(m2 , Math.min(m3 , m5));

            res.add(min);

            if (min == m2){
                i2++;
            }

            if (min == m3){
                i3++;
            }

            if (min == m5){
                i5++;
            }


        }

        
        return res.get(res.size() - 1);
    }
}
