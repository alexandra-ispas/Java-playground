package TheCompleteCodingInterviewGuide.challenge8;

/**
 * Consider an m x n grid where each (m, n) cell has an elevation represented by a
 * number between 1 and 5 (5 is the highest elevation). A ball is placed in a cell of the grid.
 * This ball can fall into another cell, as long as that cell has a smaller elevation than the ball
 * cell. The ball can fall in four directions: north, west, east, and south. Display the initial
 * grid, as well as the grid after the ball falls on all possible paths. Mark the paths with 0.
 */
public class TheFallingBall {

    public static void displayPath (int[][] grid, int m, int n, int i, int j) {
        ballPath ( grid[i][j], i, j, m, n, grid );
        for(int k = 0; k < m; k++) {
            for(int w = 0; w < n; w++) {
                System.out.print (grid[k][w] + "  ");
            }
            System.out.println ("");
        }
    }
    public static void ballPath (int height, int i, int j, int m, int n, int[][] grid) {
        if (i >= 0 && i <= (m-1) && j >= 0 && j <= (n-1)) {

            int currHeight = grid[i][j];
            if (height >= currHeight && currHeight != 0) {
                height = currHeight;
                grid[i][j] = 0;

                ballPath ( height, i, j - 1, m, n, grid );
                ballPath ( height, i - 1, j, m, n, grid );

                ballPath ( height, i, j + 1, m, n, grid );
                ballPath ( height, i + 1, j, m, n, grid );

            }
        }
    }
}
