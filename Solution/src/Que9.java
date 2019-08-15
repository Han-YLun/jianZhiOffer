/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que9 {

    public int JumpFloorII(int target) {

        if (target <= 0){
            return 0;
        }else if (target == 1){
            return 1;
        }else{
            return 2*JumpFloorII(target - 1);
        }
    }
}
