package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge3;

/**
 * Consider a string given as a char[], str. Write a snippet of code that
 * replaces all whitespaces with a sequence, %20. The resulting string should be returned
 * as a char[].
 */
public class ReplaceWhitespaces {
    public static char[] replace (char[] str) {
        String result = "";
        for (char c : str) {
            if (c != ' ') {
               result += c;
            } else {
                result += "%20";
            }
        }
        return result.toCharArray ();
    }
}
