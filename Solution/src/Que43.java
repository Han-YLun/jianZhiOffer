/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que43 {

    public String LeftRotateString(String str,int n) {

        if (str == null || str.length() == 0 || n < 0){
            return "";
        }

        if (n == 0){
            return str;
        }

        StringBuilder sb = new StringBuilder();

        n = n % str.length();

        sb.append(str.substring(n,str.length()));

        sb.append(str.substring(0,n));


        return sb.toString();


    }
}
