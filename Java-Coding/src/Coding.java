import challenge3.JosephusIterative;
import challenge3.JosephusRecursive;

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
        JosephusIterative.josephus ( 15, 3 );
    }
}
