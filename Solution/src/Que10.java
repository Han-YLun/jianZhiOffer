/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que10 {

    public int RectCover(int target) {

        if (target < 1){
            return 0;
        }

        int g = 1 , f = 2;
        while (--target > 0){
            f = f + g;
            g = f - g ;
        }

        return g;

    }
}
