package TheCompleteCodingInterviewGuide.SortingAndSearching.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Consider you’ve been given an array of words (containing characters from 'a'
 * to 'z') representing several mixed anagrams (for example, "calipers", "caret", "slat", "cater",
 * "thickset", "spiracle", "trace", "last", "salt", "bowel", "crate", "loop", "polo", "thickest", "below",
 * "thickets", "pool", "elbow", "replicas"). Write a snippet of code that prints this array so
 * that all the anagrams are grouped together (for example, "calipers", "spiracle", "replicas",
 * "caret", "cater", "trace", "crate", "slat", "last", "salt", "bowel", "below", "elbow", "thickset",
 * "thickest", "thickets", "loop", "polo", "pool" ).
 *
 * anagram = a word, phrase, or name formed by rearranging the letters of another, such as spar,
 * formed from rasp
 */
public class AnagramsGrouping {

    /**
     * If n is the number of strings (words) and each string (word) has a maximum of m
     * characters, then the time complexity of the preceding two approaches is O(nm log m).
     */
    public static void withHashing (String[] words) {
        Map<String, ArrayList<String>> groups = new HashMap<> ();
        for(String s :  words) {
            char[] s1 = s.toCharArray ();
            Arrays.sort ( s1 );

            ArrayList<String> aux = new ArrayList<> ();
            aux.add ( s );
            ArrayList<String> res = groups.putIfAbsent ( String.valueOf ( s1 ), aux );
            if (res != null ) {
                res.add ( s );
                groups.put ( String.valueOf ( s1 ), res );
            }
        }
        System.out.println (groups.values ());
//        for(Map.Entry<String, ArrayList<String>> entry : groups.entrySet ()) {
//            for(String elem : entry.getValue ()) {
//                System.out.printf ( elem + " " );
//            }
//            System.out.println ("");
//        }
    }

    /**
     * O(nm)
     */
    public static void withCountingOccurrences (String[] words) {
        Map<String, ArrayList<String>> groups = new HashMap<> ();
        for (String w : words) {
            char[] occ = new char['z' - 'A'];

            for (int i = 0; i < w.length (); i++) {
                occ[w.charAt ( i ) - 'A']++;
            }

            if (groups.containsKey ( String.valueOf ( occ ) )) {
                groups.get ( String.valueOf ( occ ) ).add ( w );
            } else {
                ArrayList<String> aux = new ArrayList<> ();
                aux.add ( w );
                groups.put ( String.valueOf ( occ ), aux );
            }
        }
        System.out.println (groups.values ());
    }

    public static void sort (String[] words) {
        Arrays.sort ( words, (o1, o2) -> {
            char[] s1 = o1.toCharArray ();
            char[] s2 = o2.toCharArray ();
            Arrays.sort ( s1 );
            Arrays.sort ( s2 );
            return String.valueOf ( s1 ).compareTo ( String.valueOf ( s2 ) );
        } );
    }
}
