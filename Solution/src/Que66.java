/**
 * @author: hyl
 * @date: 2019/08/19
 **/
public class Que66 {

    public int movingCount(int threshold, int rows, int cols) {

        int[][] flag = new int[rows][cols];

        return helper(0 , 0 , rows , cols , flag , threshold);

    }

    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {

        if (i < 0 || i >= rows || j < 0 || j >= cols || (numSum(i) + numSum(j)) > threshold || flag[i][j] == 1){
            return 0;
        }

        flag[i][j] = 1;

        //前后左右移动
        return helper(i - 1 , j , rows , cols , flag , threshold)
                + helper(i + 1 , j , rows , cols , flag , threshold)
                + helper(i , j - 1 , rows , cols , flag , threshold)
                + helper(i , j + 1 , rows , cols , flag , threshold) + 1;
        
    }

    /**
     * 求出i的各位之和
     * @param i
     * @return
     */
    private int numSum(int i) {

        int sum = 0;
        while (i > 0){
            sum += (i % 10);
            i /= 10;
        }

        return sum;
    }
}
