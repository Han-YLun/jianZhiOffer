/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que8 {

    public int JumpFloor(int target) {

        return jump(target);


    }

    private int jump(int i) {

        if (i == 1 || i == 2){
            return i;
        }

        return jump(i - 1) + jump(i - 2);
    }
}
