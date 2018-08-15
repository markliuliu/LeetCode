package Q70;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {

    /*
    public int climbStairs(int n) {
        if(n == 0 )return 0;
        if(n == 1 )return 1;
        return climbStairs(n-1)+climbStairs(n-2);

    }
    */
    public int climbStairs(int n) {
        int odd = 1; //means 1;
        int even = 1;//means 0;
        for(int i=2; i<=n; i++)
        {
            if(i%2==0){
                even+=odd;
            }else
            {
                odd+=even;
            }
        }
        return Math.max(odd, even);
    }

}
