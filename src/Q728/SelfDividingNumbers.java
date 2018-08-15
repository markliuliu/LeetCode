package Q728;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            boolean selfDividing = true;
            for(int num = i; num!=0; num/=10)
            {
                int factor = num%10;
                if(factor==0 || i%factor != 0) {
                    selfDividing=false;
                    break;
                }
            }
            if(selfDividing==true)
            {
                output.add(i);
            }
        }
        return output;
    }
}
