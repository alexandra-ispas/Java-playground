package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers, find the longest subarray where the absolute difference between any
 * two elements is less than or equal to 1.
 */
public class PickingNumbers {
    public static int getSize(List<Integer> a) {
        Map<Integer, Integer> frequency = new HashMap<> ();

        for(int elem : a) {
            Integer res = frequency.putIfAbsent ( elem, 1 );
            if(res != null) {
                frequency.put ( elem, frequency.get ( elem ) + 1);
            }
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : frequency.entrySet ()) {
            if(frequency.containsKey ( entry.getKey () - 1 ))
                result = Math.max ( result, entry.getValue () + frequency.get(entry.getKey () - 1) );
            else
                result = Math.max ( result, entry.getValue ());
        }
        return result;
    }
}
