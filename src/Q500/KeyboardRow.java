package Q500;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 2017/7/1.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] ans = {};

        List<String> temp = new ArrayList<String>();

        for(String word: words)
        {

            if(isSameRow(word))
            {
                temp.add(word);
            }
        }

        return temp.toArray(new String[0]);
    }
    public boolean isSameRow(String word)
    {
        word = word.toLowerCase();
        String[] keybord = {"qwertyuiop",
                "asdfghjkl",
                "zxcvbnm"};
        for(String row: keybord)
        {
            if( row.indexOf(word.charAt(0)) != -1) {
                for (int i = 1; i < word.length(); i++) {
                    if( row.indexOf(word.charAt(i)) ==-1 )
                    {
                        return false;
                    }
                }
                return true;
            }

        }
        return false;
    }
}
