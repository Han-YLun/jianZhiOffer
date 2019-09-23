/**
 * @author: hyl
 * @date: 2019/08/19
 **/
public class Que52 {

    public boolean match(char[] str, char[] pattern) {

        if (str == null || pattern == null){
            return false;
        }

      

        int sIndex = 0;
        int pIndex = 0;

        return matchIndex(str , sIndex , pattern , pIndex);
    }

    private boolean matchIndex(char[] str, int sIndex, char[] pattern, int pIndex) {

        //str和pattern同时到达末尾,则匹配成功
        if (sIndex == str.length && pIndex == pattern.length){
            return true;
        }

        //若pattern先到尾,而str还没到达末尾,则匹配失败
        if (sIndex != str.length && pIndex == pattern.length){
            return false;
        }

        //若pattern第二个字符是*
        if (pIndex + 1 < pattern.length && pattern[pIndex + 1] == '*'){
            //如果字符串第一个字符跟模式串第一个字符匹配
            if (sIndex != str.length && pattern[pIndex] == str[sIndex]
                || sIndex != str.length && pattern[pIndex] == '.'){


                //分三组情况:
                    //字符串后移一个字符,模式串后移两个字符
                    //模式串后移两个字符,相当于x*被忽略
                    //字符串后移一个字符,模式不变,即继续匹配字符下一位,因为*可以匹配多位
                return matchIndex(str , sIndex + 1 , pattern , pIndex + 2)
                        || matchIndex(str , sIndex , pattern , pIndex + 2)
                        || matchIndex(str , sIndex + 1 , pattern , pIndex);
            }else{
                //如果字符串第一个字符跟模式第一个字符不匹配，则模式后移2个字符，继续匹配
                return matchIndex(str , sIndex , pattern ,pIndex + 2);
            }
        }


        //若pattern第二个字符不是*
        //当字符串和模式串相等时或者模式串是.时,字符串和模式串都向后移
        if (sIndex < str.length && pattern[pIndex] == str[sIndex]
                || pattern[pIndex] == '.'){
            return matchIndex(str , sIndex + 1 , pattern , pIndex + 1);
        }

        return false;

    }

    public static void main(String[] args) {
        new Que52().match("aaa".toCharArray(),"a*".toCharArray());
    }
}
