import java.util.*;

/**
 * @author: hyl
 * @date: 2019/08/16
 **/
public class Que34 {

    //时间复杂度为O(N),空间度度咋读为O(N)
    public int FirstNotRepeatingChar(String str) {

        if (str == null || str.length() == 0){
            return -1;
        }

        Map<Character,Integer> map = new LinkedHashMap<>();

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar,map.getOrDefault(aChar,0) + 1);
        }


        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1){
                return i;
            }
        }


        return -1;
    }

    //时间复杂度为O(N),空间度度咋读为O(1)
    public int FirstNotRepeatingChar1(String str) {

        if (str == null || str.length() == 0){
            return -1;
        }

        int[] word = new int[58];

        for (char c : str.toCharArray()) {
            word[c - 'A'] += 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (word[str.charAt(i) - 'A'] == 1){
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Que34().FirstNotRepeatingChar("google"));
    }
}
