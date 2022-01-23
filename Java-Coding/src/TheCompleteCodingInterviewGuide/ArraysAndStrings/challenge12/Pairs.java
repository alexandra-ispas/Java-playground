package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Consider an array of integers (positive and negative), m. Write a snippet of code
 * that finds all the pairs of integers whose sum is equal to a given number, k.
 */
public class Pairs {
    public static void findPairs2(int[] arr, int k) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<> ();
        for(int i = 0; i < arr.length; i++) {
            ArrayList<Integer> aux = new ArrayList<> ();
            aux.add ( i );
            ArrayList<Integer> res = map.putIfAbsent ( arr[i], aux );
            if(res != null) {
                res.add ( i );
                map.put ( arr[i], res );
            }
        }

        for(int i = 0; i < arr.length; i++) {
            int target = k - arr[i];
            if(map.containsKey ( target )) {
                ArrayList<Integer> aux = map.get ( target );
                for(int elem : aux) {
                    if(i == elem) continue;
                    System.out.println (arr[i] + " " + arr[elem]);
                }
            }
        }
    }

    public static void findPairs(int[] arr, int k) {
        int start = 0, end = arr.length - 1;

        Arrays.sort ( arr );
        while(start < end) {
            int sum = arr[start] + arr[end];
            if (sum == k) {
                System.out.println ( arr[start] + "  " + arr[end] );
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
    }
}
