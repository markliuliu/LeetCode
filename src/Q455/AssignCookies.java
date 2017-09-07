package Q455;

import java.util.Arrays;

/**
 * Created by Mark on 2017/8/27.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i= 0, j=0, count=0;
        while(i<s.length-1 || j<g.length-1)
        {
            if(s[i]>=g[j]){
                count++;
                i++;
                j++;
            }else if(s[i]<g[j])
            {
                i++;
            }
        }
        return count;
    }
}
