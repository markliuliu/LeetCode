package Q416M;

import java.util.Arrays;
/*
    I think this is not a good algorithm.
    Can be modified to DP
 */
public class Solution {
    public boolean canPartition(int[] nums) {
        if(nums==null) return false;
        int sum = 0;
        for(int i = 0; i<nums.length ; i++) {
            sum += nums[i];
        }
        if(sum%2==1)return false;
        Arrays.sort(nums);
        if(sum/2 == nums[nums.length-1]) return true;
        int index = Arrays.binarySearch(nums , sum/2 - nums[nums.length-1]);
        if(index>=0) return true;
        else{
            index = -1*index -1;
            if(index==0)return false;
        }
        return canPartition(nums, index-1, nums[nums.length-1], sum/2);
    }

    public boolean canPartition(int[] nums, int index, int sum, int target){
        if(index <0) return sum==target;
        if(sum==target) return true;
        if(sum> target) return false;

        return canPartition(nums,index-1, sum+nums[index], target) ||
                canPartition(nums, index-1, sum, target);
    }
}
