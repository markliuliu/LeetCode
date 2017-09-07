package Q496;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mark on 2017/7/5.
 */
public class NextGreaterElement {
    public static void main(String[] args)
    {
        NextGreaterElement n = new NextGreaterElement();
        int[] a = {4,2,3};
        int[] b = {1,2,4,3};
        int[] c = {4,1,2};
        int[] d = {1,3,4,2};
        n.nextGreaterElement(a,b);
    }

    public int[] nextGreaterElement(int[] findNums, int[] nums) {

        int[] output = new int[findNums.length];
        for(int i = 0 ; i < findNums.length ; i++)
        {
            output[i] = -1;
            for(int index = 0; index < nums.length ; index++)
            {
                if(nums[index]==findNums[i])
                {


                    for(; index< nums.length ; index++) {


                        if(nums[index]>findNums[i])
                        {
                            output[i] = nums[index];
                            break;
                        }

                    }
                    break;
                }

            }
        }
        return output;
    }
}
