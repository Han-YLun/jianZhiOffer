/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que37 {

    public int GetNumberOfK(int [] array , int k) {

        int count = 0;
        for(int i = 0; i < array.length;i++){
            if(k == array[i]){
                count++;
            }
        }
        return count;

    }


}
