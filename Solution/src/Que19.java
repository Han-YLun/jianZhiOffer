import java.util.ArrayList;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que19 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return null;
        }

        ArrayList<Integer> res = new ArrayList<>();


        int row = matrix.length , col = matrix[0].length,
            left = 0 , right = col - 1 , top = 0 ,  bottom = row - 1;


        while (left <= right && top <= bottom){

            //从左往右
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }

            //从上往下
            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }

            //从右往左
           if (top != bottom){
               for (int i = right-1; i >=left ; i--) {
                   res.add(matrix[bottom][i]);
               }
           }


           //从下往上
            if (left != right){
                for (int i = bottom - 1; i > top ; i--) {
                    res.add(matrix[i][left]);
                }    
            }


            top++;
            left++;
            right--;
            bottom--;

        }

        return res;
    }
}
