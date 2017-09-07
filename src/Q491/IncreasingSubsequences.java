package Q491;

import java.util.*;

/**
 * Created by Mark on 2017/7/27.
 */
public class IncreasingSubsequences {
    public static void main(String args[])
    {
        int[] nums = {4, 6, 7, 7};
        IncreasingSubsequences i = new IncreasingSubsequences();
        i.findSubsequences(nums);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        for(int i = 0 ; i<nums.length;i++)
        {
            int originSize = output.size();
            for(int j=0; j<originSize;j++)
            {
                List<Integer> oneline = output.get(j);
                if( oneline.get(oneline.size()-1) <= nums[i])
                {
                    List<Integer> copy = new ArrayList<Integer>(oneline);
                    copy.add(nums[i]);
                    output.add(copy);
                }
            }
            List<Integer> newStart = new ArrayList<Integer>();
            newStart.add(nums[i]);
            output.add(newStart);
        }

        Set<List<Integer>> set = new LinkedHashSet<List<Integer>>();
        for(int i = output.size()-1; i>=0; i--)
        {
            if(output.get(i).size()<2) {
                output.remove(i);
            }
            else {
                set.add(output.get(i));
            }
        }
        return new ArrayList<>(set);

    }


}
