package Q448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mark on 2017/7/31.
 * TODO: this has extra space. but the question asked us not to use extra space.
 */
public class FindDisappear {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        int[] appear = new int[nums.length];

        for(int i=0; i<nums.length ; i++)
        {
            appear[nums[i]-1]++;
        }
        for(int i=appear.length-1; i>=0; i--)
        {
            if(appear[i]==0) output.add(i+1);
        }
        return output;

    }
}
