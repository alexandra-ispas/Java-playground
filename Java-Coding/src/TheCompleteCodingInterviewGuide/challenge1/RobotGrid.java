package TheCompleteCodingInterviewGuide.challenge1;

import java.awt.Point;
import java.util.Set;

public class RobotGrid {
    /* Recursive method
    * firstly, the robot is in the cell (m, n) in the upper-left corner of the grid,
    * and it has to get to the bottom-right corner which id the (0, 0) cell
    * time complexity: O(2^(m + n)
    * in each recursive call we have to make 2 valid choices: either we add the
    * current cell to the path or we don't
    */
    public static boolean SolveRobotGrid(boolean[][] grid, int n, int m, Set<Point> path) {
        if(n < 0 || m < 0) {
            /* if the robot is out of the maze*/
            return false;
        }
        if(grid[m][n]) {
            /* if the cell is not accessible */
            return false;
        }
        if((n == 0 && m == 0) /* if the robot reached the desired cell now or in a recursive call */
                || SolveRobotGrid ( grid, m - 1, n, path )
                || SolveRobotGrid ( grid, m, n - 1, path )) {
            path.add ( new Point (m, n) );
            return true;
        }

        return false;
    }
}
