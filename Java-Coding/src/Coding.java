import challenge1.RobotGrid;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Coding {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        boolean[][] grid = new boolean[6][6];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                grid[i][j] = i == 2 && j >= 2;
            }
        }
        grid[3][5] = true;
        Set<Point> path = new HashSet<> ();
        System.out.println ("Robot grid problem: " + RobotGrid.SolveRobotGrid ( grid, m, n, path ) + "  " + path);
    }
}
