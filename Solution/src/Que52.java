/**
 * @author: hyl
 * @date: 2019/08/19
 **/
public class Que52 {

    public boolean match(char[] str, char[] pattern) {

        if (str == null || pattern == null){
            return false;
        }

        //若字符串的长度为1
        if (str.length == 1){
            if (pattern.length == 1){
                if (str[0] == pattern[0] || pattern[0] == '.'){
                    return true;
                }
                return false;
            }
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
            if (sIndex != str.length && pattern[pIndex] == str[sIndex]
                || sIndex != str.length && pattern[pIndex] == '.'){


                return matchIndex(str , sIndex + 1 , pattern , pIndex + 2)
                        || matchIndex(str , sIndex , pattern , pIndex + 2)
                        || matchIndex(str , sIndex + 1 , pattern , pIndex);
            }else{
                return matchIndex(str , sIndex , pattern ,pIndex + 2);
            }
        }


        //若pattern第二个字符不是*
        if (sIndex != str.length && pattern[pIndex] == str[sIndex]
            || sIndex != str.length && pattern[pIndex] == '.'){
            return matchIndex(str , sIndex + 1 , pattern , pIndex + 1);
        }

        return false;

    }
}
