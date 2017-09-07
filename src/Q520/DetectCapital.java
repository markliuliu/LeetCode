package Q520;

/**
 * Created by Mark on 2017/7/22.
 */
public class DetectCapital {
    public static void main(String args[])
    {
        String s = "flag";
        DetectCapital d = new DetectCapital();
        System.out.println(d.detectCapitalUse(s));
    }
    public boolean detectCapitalUse(String word) {
        word = word.trim();
        char[] words = word.toCharArray();
        if(Character.isUpperCase(words[0]))
        {
            if( words.length<=2) return true;
            for(int i = 2; i<words.length; i++)
            {
                if(Character.isUpperCase(words[i]) != Character.isUpperCase(words[i-1]))
                    return false;
            }
            return true;
        }
        else
        {
            for(int i = 1; i<words.length; i++)
            {
                if(Character.isUpperCase(words[i]))
                    return false;
            }
            return true;
        }
    }
}
