import java.util.Arrays;

/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que45 {


    public boolean isContinuous(int [] numbers) {

        if(numbers == null || numbers.length == 0){
            return false;
        }

        Arrays.sort(numbers);

        //统计0的个数
        int countZero = 0;

        for (int i = 0; i < numbers.length; i++) {

            //当当前值为0时,不进行下面操作
            if (numbers[i] == 0){
                countZero++;
                continue;
            }

            if (i > 0){

                //当前后两个数相等时,不形成递增序列
                if (numbers[i] == numbers[i-1]){
                    return false;
                }

                //当后面和前面中间缺少至少一个数并且前面数不为0,使用0进行填充
                if (numbers[i] - numbers[i-1] > 1 && numbers[i-1] != 0){
                    countZero -= (numbers[i] - numbers[i-1] - 1);
                }
            }
        }

        //当零的个数大于等于0时返回true
        if (countZero >= 0){
            return true;
        }

        return false;

    }
}
