package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge9;

/**
 * Consider a given n x n matrix of integers, M. Write a snippet of code that rotates
 * this matrix by 90 degrees in a counterclockwise direction without using any extra space.
 */
public class RotateMatrix {
    public static void transpose(int[][] matrix, int n){
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void rotateMatrix(int[][] matrix, int n) {
        // using transpose
        transpose ( matrix, n );

        // reverse columns order
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                int aux = matrix[j][i];
                matrix[j][i] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = aux;
            }
        }
    }
}
