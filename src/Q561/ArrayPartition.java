package Q561;

import java.util.Arrays;

/**
 * Created by Mark on 2017/7/1.
 */
public class ArrayPartition {

    public static void main(String args[]){
        int [] array = {1,4,3,2};
        System.out.println(arrayPairSum(array));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int output = 0;
        for(int i = 0; i<nums.length; i+=2)
        {
            output += nums[i];
        }
        return output;
    }
}
