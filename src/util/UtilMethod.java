package util;

import java.util.Collection;

/**
 * Created by Mark on 2017/8/13.
 */
public class UtilMethod {
    public static int[] IntegerToInt(Collection<Integer> input)
    {
        int[] output = new int[input.size()];
        int i=0;
        for(int num : input)
        {
            output[i] = num;
            i++;
        }
        return output;
    }

    public static void printArray(int[] a)
    {
        for(int value : a){
            System.out.printf("%d",value);
        }
        System.out.printf("\n");
    }
}
