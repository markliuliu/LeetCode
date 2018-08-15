package Q242;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c: sc)
        {
            Integer num = map.get(c);
            if(num ==null) {
                num = 1;
            }else {
                num += 1;
            }
            map.put(c,num);
        }
        for(char c: tc)
        {
            Integer num = map.get(c);
            if(num ==null) {
                return false;
            }else {
                num -= 1;
            }
            map.put(c,num);
        }
        Iterator<Character> iter = map.keySet().iterator();
        while(iter.hasNext())
        {
            char c = iter.next();
            if(map.get(c) != 0)return false;
        }
        return true;
    }
}
