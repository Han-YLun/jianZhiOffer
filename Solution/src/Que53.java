/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que53 {



    public boolean isNumeric(char[] str) {


        if (str == null || str.length == 0){
            return false;
        }

        // 标记符号、小数点、e是否出现过
        boolean hasE = false;
        boolean decimal = false;
        boolean sign = false;

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == 'e' || c == 'E'){

                // 不能同时存在两个e
                if (hasE){
                    return false;
                }

                // e后面一定要接数字
                if (i == str.length - 1){
                    return false;
                }

                hasE = true;
            }else if(c == '+' || c == '-'){


                // 第二次出现+-符号，则必须紧接在e之后
                if (sign && str[i-1] != 'e' && str[i-1] != 'E' ){
                    return false;
                }

                // 第一次出现+-符号，且不是在字符串开头，则也必须紧接在e之后
                if (!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E'){
                    return false;
                }

                sign = true;
            }else if(c == '.'){

                // e后面不能接小数点，小数点不能出现两次
                if (hasE || decimal){
                    return false;
                }
                decimal = true;
            }else if(c < '0' || c > '9'){

                // 不合法字符
                return false;
            }
        }
        return true;

    }
}
