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

        //将第K为到str.length放在前面
        sb.append(str.substring(n,str.length()));

        //将前K位放在后面
        sb.append(str.substring(0,n));


        return sb.toString();


    }
}
