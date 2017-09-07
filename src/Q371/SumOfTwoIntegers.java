package Q371;

/**
 * Created by Mark on 2017/8/1.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int and = a & b;
        int xor = a ^ b;
        while(and != 0)
        {
            and = and <<1;
            int tempAnd = and & xor;
            xor = and ^ xor;
            and = tempAnd;
        }
        return xor;
    }
}
