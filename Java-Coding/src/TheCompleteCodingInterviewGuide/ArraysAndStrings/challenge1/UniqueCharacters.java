package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge1;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static boolean hasUniqueCharacters(String s) {
        Map<Character, Boolean> map = new HashMap<> ();

        for(int i = 0; i < s.length (); i++) {
            if(Character.isWhitespace ( s.charAt ( i ) ))
                continue;
            Boolean res = map.putIfAbsent ( s.charAt ( i ), true );
            if(res != null) {
                return false;
            }
        }
        return true;
    }
}
