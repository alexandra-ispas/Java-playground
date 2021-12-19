package hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Alice is a kindergarten teacher. She wants to give some candies to the children in her class.
 * All the children sit in a line and each of them has a rating score according to his or her
 * performance in the class.  Alice wants to give at least 1 candy to each child. If two children
 * sit next to each other, then the one with the higher rating must get more candies. Alice wants
 * to minimize the total number of candies she must buy.
 */

public class MinimumCostValley {

    public static long candies(int n, List<Integer> arr) {
        long[] candies = new long[arr.size () + 1];

        candies[0] = 1; // the children get at least one candy

        for(int i = 1; i < arr.size (); i++) {
            if(arr.get ( i ) > arr.get ( i - 1 )) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
        }

        for(int i = arr.size () - 2; i >= 0; i--) {
            if(arr.get ( i ) > arr.get ( i + 1 ) && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        return Arrays.stream ( candies ).sum ();
    }
}
