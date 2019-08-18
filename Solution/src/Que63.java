import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que63 {

    List<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {


       if (list.size() == 1){
           return list.get(0) * 1.0;
       }else{
           Collections.sort(list);

           if (list.size() % 2 == 0){
                return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) * 1.0 / 2;
           }else{
               return list.get(list.size() / 2) * 1.0;
           }
       }

    }
}
