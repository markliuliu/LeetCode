package Q122;

/**
 * Created by Mark on 2017/8/27.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int output =0;
        for(int i =0; i<prices.length-1; i++)
        {
            if(prices[i]<prices[i+1]) output += prices[i+1] - prices[i];
        }
        return output;
    }
}
