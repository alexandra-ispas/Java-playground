package hackerrank;

/**
 * A string is said to be a special string if either of two conditions is met:
 *
 * All the characters are the same, e.g. aaa.
 * All characters except the middle one are the same, e.g. aadaa.
 * A special substring is any substring of a string which meets one of those criteria.
 * Given a string, determine how many special substrings can be formed from it.
 */
public class Palindromes {

    public static long substrCount(String s) {
        long counter = 0;
        int diffCharsPos = -1;
        for(int i = 0; i < s.length () - 1; i++) {
            char startChar = s.charAt ( i );
            diffCharsPos = -1;

            for(int j = i + 1; j < s.length (); j++) {
                if(s.charAt ( j ) == startChar) {
                    if(diffCharsPos == -1 || (diffCharsPos - i == j - diffCharsPos))
                        counter++;
                } else {
                    if(diffCharsPos == -1) {
                        diffCharsPos = j;
                    } else {
                        break;
                    }
                }
            }

        }
        return counter;
    }
}
