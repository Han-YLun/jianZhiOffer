/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que47 {

    public int Sum_Solution(int n) {

        return n == 1 ? 1 : Sum_Solution(n-1) + n;
    }
}
