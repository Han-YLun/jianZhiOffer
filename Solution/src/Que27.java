

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que27 {

    public ArrayList<String> Permutation(String str) {

        ArrayList<String> res = new ArrayList<>();

        if (str != null && str.length() != 0){
            getArrange(str.toCharArray() , 0 , res);
        }


        Collections.sort(res);
        return res;

    }

    private void getArrange(char[] chars, int i, ArrayList<String> res) {

        if (i == chars.length - 1){

            res.add(new String(chars));
        }else{
            Set<Character> charSet = new HashSet<>();

            for (int j = i; j < chars.length; j++) {

                //对于重复的字符，无需进行操作
                if (!charSet.contains(chars[j])){
                    charSet.add(chars[j]);
                    swap(chars , i , j);
                    getArrange(chars , i + 1 , res);
                    swap(chars , j , i);
                }
            }
        }


    }

    /**
     * 交换字符数组chars中i和j位置的字符
     * @param chars 字符数组
     * @param i 位置i
     * @param j 位置j
     */
    private void swap(char[] chars, int i, int j) {

        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    public static void main(String[] args) {

        new Que27().Permutation("abc");
    }
}
