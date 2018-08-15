package Q001;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[][] inputs = new int[nums.length][2];
        int[] ans = new int[2];
        for(int i=0 ; i<inputs.length; i++)
        {
            inputs[i][0] = nums[i];
            inputs[i][1] = i;
        }
        Arrays.sort(inputs, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2)
            {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        int i=0;
        int j=nums.length-1;
        int sum=Integer.MIN_VALUE;

        while(i<j)
        {
            sum = inputs[i][0]+inputs[j][0];
            if(sum == target)break;

            if(sum> target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }


        ans[0]=inputs[i][1];
        ans[1]=inputs[j][1];
        return ans;
    }

    public static void main(String[] args) {

        int[] input = {2,7,4,5};
        TwoSum question = new TwoSum();
        int[] ans = question.twoSum(input, 6);
        System.out.println("ans"+Arrays.toString(ans));

    }

    private static void printArray(int[][] input)
    {
        for(int i=0; i< input.length;i++)
        {
            System.out.println(Arrays.toString(input[i]));
        }
    }
}
