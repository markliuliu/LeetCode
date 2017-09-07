package Q349;

import util.UtilMethod;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mark on 2017/8/13.
 */
public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<Integer>();
        Set<Integer> outputSet = new HashSet<Integer>();
        for(int num:nums1)
        {
            nums1Set.add(num);
        }
        for(int num:nums2)
        {
            if(nums1Set.contains(((Integer)num))){
                outputSet.add(num);
            }
        }
        return UtilMethod.IntegerToInt(outputSet);
    }
}
