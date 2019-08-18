import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author: hyl
 * @date: 2019/08/17
 **/
public class Que54 {

    HashMap<Character,Character> map = new LinkedHashMap<>();


    //Insert one char from stringstream
    public void Insert(char ch)
    {
      if (map.containsKey(ch)){
        map.remove(ch);
      }else{
          map.put(ch,ch);
      }

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if (map.isEmpty()){
            return '#';
        }else{
            Set<Character> characters = map.keySet();
            return characters.iterator().next();
        }
    }

    public static void main(String[] args) {
        Que54 que54 = new Que54();

        que54.Insert('B');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('a');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('b');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('y');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('B');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('a');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('b');
        System.out.println(que54.FirstAppearingOnce());

        que54.Insert('y');
        System.out.println(que54.FirstAppearingOnce());


    }
}
