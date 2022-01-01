package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Consider a given string containing whitespaces and a-z and 0-9 characters.
 * Write a snippet of code that extracts integers from this string. You can assume that any
 * sequence of consecutive digits forms a valid integer.
 */
public class ExtractIntegers {
    public static List<Integer> extractInteger(String s) {
        List<Integer> result = new ArrayList<> ();
        String[] words = s.split("\\s");

        for(String w : words) {
            String number = "";
            for(int i = 0; i < w.length (); i++) {
                if(Character.isDigit ( w.charAt ( i ) )) {
                    number += w.charAt ( i );
                } else {
                    if(number.length () > 0) {
                        result.add ( Integer.parseInt ( number ) );
                        number = "";
                    }
                }
            }
            if(number.length () > 0) {
                result.add ( Integer.parseInt ( number ) );
            }
        }
        return result;
    }
}
