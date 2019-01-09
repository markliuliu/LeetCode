package Q200;

import java.util.*;

public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length ==0) return 0;
        int[][] flags = new int[grid.length][grid[0].length];
        int landCount = 0, max, min;
        Set<Set<Integer>> flagSet = new HashSet<>();
        boolean newIsland;
        for(int i = 0; i<grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    newIsland = true;
                    if(i!=0 && flags[i-1][j] != 0){
                        flags[i][j] = flags[i-1][j];
                        newIsland = false;
                    }
                    if(j!=0 && flags[i][j-1] != 0){
                        if( !newIsland && flags[i][j-1] != flags[i-1][j]){
                            Set first = null;
                            Set second = null;
                            Iterator<Set<Integer>> iter = flagSet.iterator();
                            Set next;
                            while(iter.hasNext()){
                                next = iter.next();
                                if(next.contains(flags[i-1][j])){
                                    first = next;
                                }
                                if(next.contains(flags[i][j-1])){
                                    second = next;
                                }
                                if(first!=null && second!=null) {
                                    if(first.size() < second.size()){
                                        Set temp = first;
                                        first = second;
                                        second = temp;
                                    }
                                    break;
                                }
                            }
                            if(first != second){
                                first.addAll(second);
                                second.clear();
                            }
                        }
                        flags[i][j] = flags[i][j-1];
                        newIsland = false;
                    }
                    if(newIsland){
                        flags[i][j] = ++landCount;
                        Set set = new TreeSet<>();
                        set.add(landCount);
                        flagSet.add(set);
                    }

                }else{
                    flags[i][j] = 0;
                }
            }
        }
        Iterator<Set<Integer>> iter = flagSet.iterator();
        Set next;
        int result = 0;
        while(iter.hasNext()){
            next = iter.next();
            if(next.isEmpty()) result++;
        }
        return  result;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        new Solution().numIslands(grid);
    }
}
