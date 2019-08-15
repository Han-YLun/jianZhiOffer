/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que44 {

    public String ReverseSentence(String str) {

        if (str == null ||str.trim().equals("")){
            return str;
        }

        StringBuilder sb = new StringBuilder();

        String[] s = str.split(" ");
        for (int i = s.length-1; i >=0 ; i--) {
            sb.append(s[i]);
            if (i != 0){
                sb.append(" ");
            }
        }

        return sb.toString();

    }


}
