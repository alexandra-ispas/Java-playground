package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge7;

import java.util.ArrayList;
import java.util.List;

/**
 * Consider a given string containing any kind of characters, including Unicode
 * characters, that are represented in Java as surrogate pairs. Write a snippet of code that
 * extracts the code points of the surrogate pairs in a list.
 *
 * Explanation: Counting the code points in str can be done by calling str.
 * codePointCount(0,str.length()), which returns 1, even if the str length is 2.
 * Calling str.codePointAt(0) returns 128149, while calling str.codePointAt(1)
 * returns 56469. Calling Character.toChars(128149).length returns 2 since two
 * characters are needed to represent this code point as a Unicode surrogate pair. For ASCII
 * and Unicode 16-bit characters, it will return 1.
 *
 */
public class ExtractCodePointsOfSurrogatePairs {
    public static List<Integer> getCodePoints(String s) {
        List<Integer> result = new ArrayList<> ();
        for(int i = 0; i < s.length (); i++) {
            if(i + 1 < s.length () && s.codePointCount ( i, i + 2 ) == 1) {
                result.add ( s.codePointAt ( i ) );
                result.add ( s.codePointAt ( i + 1 ) );
                i++;
            }
        }
        return result;
    }
}
