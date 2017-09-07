package Q463;

/**
 * Created by Mark on 2017/7/12.
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int lb = 0;
        int rb = grid[0].length-1;
        int tb = 0;
        int bb = grid.length-1;

        int output = 0;

        for(int i = tb; i<=bb; i++)
        {
            for(int j = lb; j<=rb ; j ++)
            {
                if(grid[i][j] == 1)
                {
                    output+=4;
                    if(j!=lb && grid[i][j-1]==1) output--;
                    if(j!=rb && grid[i][j+1]==1) output--;
                    if(i!=tb && grid[i-1][j]==1) output--;
                    if(i!=bb && grid[i+1][j]==1) output--;
                }
            }
        }

        return output;
    }
}
