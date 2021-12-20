import challenge3.JosephusIterative;
import challenge3.JosephusRecursive;
import challenge4.ColorSpots;

public class Coding {
    public static void main(String[] args) {
//        int m = 5;
//        int n = 5;
//        boolean[][] grid = new boolean[6][6];
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                grid[i][j] = i == 2 && j >= 2;
//            }
//        }
//        grid[3][5] = true;
//        Set<Point> path = new HashSet<> ();
//        System.out.println ("Robot grid problem: " + RobotGrid.SolveRobotGrid ( grid, m, n, path ) + "  " + path);
//
//        int[] range = IntStream.range ( 1, n + 1 ).toArray ();
//        List<Integer> cities_list = Arrays.stream(range).boxed().toList();
//        System.out.print ( cities_list );

//        Hanoi.TowerOfHanoi (3, 'A', 'B', 'C');

//        System.out.println ( JosephusRecursive.josephus ( 15, 3 ));
//        JosephusIterative.josephus ( 15, 3 );


        int r = 5, c = 5;
        int[][] grid = new int[r][c];

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[0][3] = 2;
        grid[0][4] = 2;

        grid[1][0] = 2;
        grid[1][1] = 1;
        grid[1][2] = 2;
        grid[1][3] = 3;
        grid[1][4] = 3;

        grid[2][0] = 2;
        grid[2][1] = 3;
        grid[2][2] = 3;
        grid[2][3] = 3;
        grid[2][4] = 3;

        grid[3][0] = 3;
        grid[3][1] = 2;
        grid[3][2] = 1;
        grid[3][3] = 1;
        grid[3][4] = 3;

        grid[4][0] = 1;
        grid[4][1] = 3;
        grid[4][2] = 2;
        grid[4][3] = 3;
        grid[4][4] = 3;

        ColorSpots.colorSpots ( grid, r, c );
    }
}
