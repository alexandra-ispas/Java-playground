package hackerrank;

import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, find the minimum absolute difference between any two elements
 * in the array.
 */
public class MinimumAbsoluteDifference {

    public static int minimumAbsoluteDifference (List<Integer> arr) {
        Collections.sort ( arr );

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < arr.size () - 1; i++) {
            int val = Math.abs(arr.get ( i ) - arr.get ( i + 1 ));
            if(val < minDiff) {
                minDiff = val;
            }
        }
        return minDiff;
    }
}
