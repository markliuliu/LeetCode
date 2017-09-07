package Q566;

/**
 * Created by Mark on 2017/7/4.
 */
public class ReshapeMatrix {

    public static void main(String[] args)
    {
        ReshapeMatrix r = new ReshapeMatrix();
        int[][] matrix = {{1,2},{3,4},{5,6}};
        r.matrixReshape(matrix,6,1);
    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(r*c != row * col)
        {
            //size not same.
            return nums;
        }
        int[][] output = new int[r][c];
        for(int i = 0 ; i<r; i++) {
            for (int j = 0; j < c; j++) {
                int pos = i * c + j;
                int posC = pos % col;
                int posR = pos / col;
                System.out.println("-------------");
                System.out.println(pos);
                System.out.println(posR);
                System.out.println(posC);
                System.out.println(nums[posR][posC]);
                output[i][j] = nums[posR][posC];
            }
        }
        return output;
    }
}
