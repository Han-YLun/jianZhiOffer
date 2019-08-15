/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que2 {


    public String replaceSpace(StringBuffer str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' '){
                sb.append("%20");

            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
