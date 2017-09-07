package Q598;

/**
 * Created by Mark on 2017/8/9.
 */
public class RangeAddition {

    public void addArray(int[] row, int[] col, int[] ops)
    {
        for(int i=0;i<ops[0];i++) {
            col[i]++;
        }
        for(int j=0;j<ops[1];j++) {
            row[j]++;
        }
    }
    public int maxCount2(int m, int n, int[][] ops) {
        int[] col = new int[m];
        int[] row = new int[n];
        int i,j;
        for(int[] op:ops)
        {
            addArray(row, col, op);
        }
        for(i=0; i<m;i++)
        {
            if(col[i]!=col[0]) {
                break;
            }
        }
        for(j=0; j<n;j++)
        {
            if(row[j]!=row[0]) {
                break;
            }
        }
        return i*j;
    }
}
