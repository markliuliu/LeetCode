package Q279;

public class Solution {
    public int numSquares(int n) {

        int closestInt;
        if( n <= 0 ) return 0;
        closestInt = (int)Math.sqrt(n);
        int result = 0;
        int val = 0;
        int pow = 0;
        int[] resultArray = new int[closestInt+1];
        for(int i = closestInt; i>0 ; i--){
            result = 0;
            val = n;
            for(int j = i; j>0; j--){
                pow = (int) Math.pow(j,2);
                while(val >= pow){

                    val -= pow;
                    result++;
                }
            }
            resultArray[i]=result;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<=closestInt; i++){
            if(resultArray[i]<min){
                min = resultArray[i];
            }
        }
        return min;
    }
}
