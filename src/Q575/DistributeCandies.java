package Q575;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mark on 2017/7/4.
 */
public class DistributeCandies {

    public static void main(String[] args)
    {
        DistributeCandies r = new DistributeCandies();
        int[] matrix = {1, 1,1, 1};
        int output = r.distributeCandies(matrix);

        System.out.println(output);
    }
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < candies.length ; i++)
        {
            set.add(new Integer(candies[i]));
        }
        int setSize = set.size();
        //return setSize > candies.length/2 ? candies.length/2: setSize;
        return Math.min(setSize, candies.length/2);
    }
}
