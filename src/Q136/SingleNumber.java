package Q136;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mark on 2017/7/18.
 */
public class SingleNumber {
    public static void main (String args[])
    {
        int[] a = {1,2,3,1,4,3,2};
        int b = new SingleNumber().singleNumber(a);
        System.out.println(b);
    }
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return (int)(set.toArray())[0];
    }
}
