/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que49 {

    public int StrToInt(String str) {

        if (str == null || str.length() == 0){
            return 0;
        }

        int sum = 0;

        char[] chars = str.toCharArray();
        boolean isNegative = true;

        for (int i = 0; i < chars.length; i++) {

            if (i == 0){
                if (chars[i] == '-'){
                    isNegative = false;
                }else if(chars[i] >= '0' && chars[i] <= '9'){
                    sum += chars[i] - '0';
                }
            }else if (chars[i] >= '0' && chars[i] <= '9'){
                sum = sum * 10 + chars[i] - '0';
            }else{
               return 0;
            }
        }

        if (sum != 0 && isNegative == false){
            sum = -sum;
        }
        return sum;
    }
}
