package Q453;

/**
 * Created by Mark on 2017/8/13.
 */
public class MinimumMoves {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int count = 0;
        for(int one: nums)
        {
            count+= one;
            if(min>one){
                min = one;
            }
        }
        return count - min*nums.length;
    }
}
