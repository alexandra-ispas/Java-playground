package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge10;

import java.util.Arrays;

/**
 * Consider a given n x m matrix of integers, M. If M(i, j) is equal to 0, then
 * the entire row, i, and column, j, should contain only zeros. Write a snippet of code that
 * accomplishes this task without using any extra space.
 */
public class MatrixWIthZeros {
    public static void modifyMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < matrix[0].length; k++) {
                        matrix[i][k] = 0;
                    }
                    i++;
                    break;
                }
            }
        }
    }
}
