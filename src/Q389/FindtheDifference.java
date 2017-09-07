package Q389;

/**
 * Created by Mark on 2017/8/6.
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        int stotal=0, ttotal=0;
        for(int i=0; i<schar.length; i++)
        {
         stotal += schar[i];
         ttotal += tchar[i];
        }
        ttotal += tchar[tchar.length -1];
        char output = (char)(ttotal - stotal);
        return output;
    }
}
