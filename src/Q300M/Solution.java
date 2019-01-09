package Q300M;


/**
 * use dynamic programming
 * can use O(nlogn)to solve this problem
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,10,4,3,8,9};
        System.out.println(new Solution().lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[][] result = new int[length][length];
        int [] maxRecord = new int[length];

        for(int i = length - 1 ; i >= 0 ; i--){
            int max = 1;
            for(int j = i ; j < length ; j++){
                if(i==j) result[i][j] = 1;
                else{
                    int tempLength = 1;
                    if(nums[i] < nums[j]) {
                        tempLength = maxRecord[j] + 1;
                        if( tempLength > max) max = tempLength;

                    }
                    result[i][j] = tempLength;
                }
            }
            maxRecord[i] = max;
        }
        int max = 0;
        for(int value : maxRecord){
            if(max < value) max = value;
        }
        return max;
    }
}
