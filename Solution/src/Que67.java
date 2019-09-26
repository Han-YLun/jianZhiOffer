/**
 * @author: hyl
 * @date: 2019/09/26
 **/
public class Que67 {

    /**
     * 当target大于3时,每次都可以分为2*3
     * 5<2*3,6<3*3,比6更大的数字我们就更不用考虑了
     * 其次看2和3的数量，2的数量肯定小于3个，为什么呢？因为2*2*2<3*3
     * 直接用n除以3，根据得到的余数判断是一个2还是两个2还是没有2就行了
     * 时间复杂度 : O(1) , 空间复杂度 ： O(1)
     * @param target
     * @return
     */
    public int cutRope(int target) {

        if(target == 2){
            return 1;
        }

        if (target == 3){
            return 2;
        }

        int x = target % 3;
        int y = target / 3;

        if(x == 0){
            return (int) Math.pow(3 , y);
        }else if(x == 1){
            return 2 * 2 * (int) Math.pow(3 , y - 1);
        }else{
            return 2 * (int) Math.pow(3 , y);
        }
    }


    /**
     * dp求解
     * 时间复杂度 : O(N^N) , 空间复杂度 ： O(N)
     * @param target
     * @return
     */
    public int cutRope1(int target) {

        if (target == 2){
            return 1;
        }

        if (target == 3){
            return 2;
        }

        int[] dp = new int[target + 1];

        dp[0] = 1;

        for (int i = 1; i < target; i++) {
            for (int j = i; j <= target; j++) {
                dp[j] = Math.max(dp[j] , dp[j - i] * i);
            }
            
        }

        return dp[target];
    }


    
}
