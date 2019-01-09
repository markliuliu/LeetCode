package Q240;

import java.util.Arrays;

/*
    this can be O(m+n)
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)return false;
        for(int i = 0 ; i < matrix.length ; i++){
            int index = Arrays.binarySearch(matrix[i], target);
            System.out.println(index);
            if(index >= 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        System.out.println(new Solution().searchMatrix(matrix, -5));
    }
}
