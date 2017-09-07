package Q485;

/**
 * Created by Mark on 2017/7/18.
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int output = 0;
        int temp = 0;
        for(int num: nums)
        {
            if(num==1)
            {
                temp++;
            }
            else
            {
                if(temp>output)
                {
                    output = temp;
                }
                temp=0;
            }

        }
        if(temp>output)
        {
            output = temp;
        }
        return output;
    }
}
