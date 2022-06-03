/*
    1572. Matrix Diagonal Sum
    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal
    and all the elements on the secondary diagonal that are not part
    of the primary diagonal.
 */

import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] test = {{5}};
        System.out.println(solution(test));
    }

    public static int solution(int[][] matrix)    {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++)    {
            sum += matrix[i][i] + matrix[i][matrix.length-1-i];
            if(i == matrix.length - 1 - i) sum -= matrix[i][i];
        }
        return sum;
    }
}
