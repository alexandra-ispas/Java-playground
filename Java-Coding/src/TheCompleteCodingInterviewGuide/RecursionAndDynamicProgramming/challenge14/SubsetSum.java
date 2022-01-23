package TheCompleteCodingInterviewGuide.RecursionAndDynamicProgramming.challenge14;

import java.util.ArrayList;

/**
 * Consider a given set (arr) of positive integers and a value, s. Write a snippet of
 * code that finds out if there is a subset in this array whose sum is equal to the given s.
 */
public class SubsetSum {
   public static boolean subsetSum (int[] arr, int s) {
       boolean[][] dp = new boolean[arr.length + 1][s + 1];

       for(int i = 0; i <= arr.length; i++) {
           dp[i][0] = true;
       }

       for(int j = 1; j <= s; j++) {
           dp[0][j] = false;
       }
       for(int i = 1; i <= arr.length; i++) {
           for(int j = 1; j <= s; j++) {
                if(arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    if(dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j - arr[i - 1]];
                    }
                }

           }
       }
       if(dp[arr.length][s]) {
           int i = arr.length;
           int j = s;
           while (i > 0 && j >= 0) {
               int value = arr[i - 1];
               if (!dp[i - 1][j]) {
                   i = i - 1;
                   j = j - value;
                   System.out.print(value + " ");
               } else {
                   i--;
               }
           }
       }
       return dp[arr.length][s];
   }
}
