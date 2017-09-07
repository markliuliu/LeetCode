package Q283M;

/**
 * TODO: this can be done in O(n).
 * Created by Mark on 2017/8/6.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i = nums.length -1; i>0; i--)
        {
            for(int j=0 ; j<i; j++)
            {
                if(nums[j]==0 && nums[j+1]!=0)
                {
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
    }
}
