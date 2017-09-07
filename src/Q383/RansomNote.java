package Q383;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mark on 2017/8/16.
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<magazine.length(); i++)
        {
            char alphabet = magazine.charAt(i);
            int num;
            if(map.containsKey(alphabet)) {
                num = map.get(alphabet);
                num++;
            }
            else {
                num = 1;
            }
            map.put(alphabet, num);
        }

        for(int i=0; i<ransomNote.length(); i++)
        {
            char alphabet = ransomNote.charAt(i);
            if(map.containsKey(alphabet)) {
                int num = map.get(alphabet);
                num--;
                if (num < 0) {
                    return false;
                }
                map.put(alphabet, num);
            }else {
                return false;
            }
        }
        return true;

    }
}
