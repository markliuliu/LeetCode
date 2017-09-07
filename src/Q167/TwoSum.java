package Q167;

/**
 * Created by Mark on 2017/8/27.
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j= numbers.length-1;
        while(i<j)
        {
            int sum = numbers[i]+numbers[j];
            if(sum >target){
                j--;
            }else if(sum <target){
                i++;
            }else{
                break;
            }
        }
        int [] output = {i+1,j+1};
        return output;
    }
}
