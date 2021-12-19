package hackerrank;

/**
 * You can perform the following operations on the string, a :
 *
 * Capitalize zero or more of a's lowercase letters.
 * Delete all the remaining lowercase letters in a .
 *
 * Given two strings, a and b, determine if it's possible to make a equal to b as described.
 * If so, print YES on a new line. Otherwise, print NO.
 *
 *
 * This algorithm uses dynamic programming
 */
public class Abbreviation {
    public static String abbreviation(String a, String b) {
        boolean[][] dp = new boolean[a.length () + 1][b.length () + 1];
        dp[0][0] = true;

        for (int i = 1; i <= a.length (); i++) {
            dp[i][0] = dp[i - 1][0] && Character.isLowerCase ( a.charAt ( i ) );
        }

        for (int i = 1; i < a.length (); i++) {
            for (int j = 1; j <= b.length (); j++) {
                dp[i][j] = (dp[i - 1][j - 1] &&
                        (Character.toUpperCase ( a.charAt ( i - 1 ) ) == b.charAt ( j - 1 ))) ||
                        (dp[i - 1][j] && Character.isLowerCase ( a.charAt ( i - 1 ) ));
            }
        }

        return dp[a.length ()][b.length ()] ? "YES" : "NO";
    }
}
