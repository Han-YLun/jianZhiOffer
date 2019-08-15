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

        int countZero = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 0){
                countZero++;
                continue;
            }

            if (i > 0){

                if (numbers[i] == numbers[i-1]){
                    return false;
                }
                if (numbers[i] - numbers[i-1] > 1 && numbers[i-1] != 0){
                    countZero -= (numbers[i] - numbers[i-1] - 1);
                }
            }
        }

        if (countZero >= 0){
            return true;
        }

        return false;

    }
}
