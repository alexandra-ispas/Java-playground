package hackerrank;

import java.util.List;

/**
 * Skyline Real Estate Developers is planning to demolish a number of old, unoccupied buildings and
 * construct a shopping mall in their place. Your task is to find the largest solid area in which
 * the mall can be constructed.
 *
 * There are a number of buildings in a certain two-dimensional landscape. Each building has a height.
 * If you join adjacent buildings, they will form a solid rectangle of area.
 * Find the area of the largest rectangle that can be formed within the bounds of consecutive buildings
 */
public class LargestRectangle {
    public static long largestRectangle(List<Integer> heights) {
        long area = 0;

        for(int i = 0; i < heights.size () - 1; i++) {
            int count = 1;
            int j = i + 1;
            int k = i - 1;

            while(j < heights.size () && heights.get ( j ) >= heights.get ( i )) {
                count++;
                j++;
            }

            while (k >= 0 && heights.get ( k ) >= heights.get ( i )) {
                count++;
                k--;
            }

            if(area < (long) count * heights.get ( i )) {
                area = (long) count * heights.get ( i );
            }
        }
        return area;
    }
}
