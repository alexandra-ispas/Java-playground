package challenge4;

import java.util.HashMap;
import java.util.Map;

/**
 * Consider an r x c grid where r stands for rows and c stands for columns. Each
 * cell has a color represented by a number k (for example, for three colors, k=3). We define
 * the connected set of a cell (or a color spot) as the total cells in which we can go from
 * the respective cell by successive displacements on the row or the column, thus keeping
 * the color. The goal is to determine the color and the number of cells of the maximum
 * connected set. In other words, we need to determine the biggest color spot.
 */
public class ColorSpots {

    public static int getSetSize(int[][] grid, int r, int c, int k) {
        if(r >= grid.length || c >= grid[0].length || grid[r][c] != k) {
            return 0;
        }

        grid[r][c] *= (-1);

        int result = 1;

        if(r - 1 >= 0) {
            result += getSetSize ( grid, r - 1, c, k );
        }
        if(r + 1 < grid.length) {
            result += getSetSize ( grid, r + 1, c, k );
        }

        if(c - 1 >= 0) {
            result += getSetSize ( grid, r, c - 1, k );
        }
        if(c + 1 < grid[0].length) {
            result += getSetSize ( grid, r, c + 1, k );
        }
        return result;
    }

    public static int colorSpots(int[][] grid, int r, int c) {
        Map<Integer, Integer> map = new HashMap<> ();
        Integer res = null;
        int size;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j] > 0) {
                    size = getSetSize ( grid, i, j, Math.abs ( grid[i][j] ) );
                    res = map.putIfAbsent ( Math.abs ( grid[i][j] ), size );
                    if (res != null && res < size) {
                        map.put(Math.abs ( grid[i][j] ), size);
                    }
                }
            }
        }

        return map.entrySet()
                .stream()
                .max ( Map.Entry.comparingByValue())
                .get ()
                .getKey ();

    }
}
