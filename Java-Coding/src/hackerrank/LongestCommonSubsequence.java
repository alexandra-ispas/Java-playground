package hackerrank;

/**
 * A string is said to be a child of a another string if it can be formed by deleting 0 or more
 * characters from the other string. Letters cannot be rearranged. Given two strings of equal length,
 * what's the longest string that can be constructed such that it is a child of both?
 *
 * Sample Input: HARRY  SALLY
 * Sample Output: 2
 *
 * Longest Common subsequence algorithm using Dynamic Programming
 */
public class LongestCommonSubsequence {
    public static int commonChild(String s1, String s2) {
        int[][] c = new int[s1.length () + 1][s2.length () + 1];

        for(int i = 0; i < s1.length (); i++) {
            for(int j = 0; j < s2.length (); j++) {
                if(s1.charAt ( i ) == s2.charAt ( j )) {
                    c[i + 1][j + 1] = c[i][j] + 1;
                } else {
                    c[i + 1][j + 1] = Math.max(c[i + 1][j], c[i][j + 1]);
                }
            }
        }

        return c[s1.length ()][s2.length ()];
    }
}
