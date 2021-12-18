package hackerrank;

/**
 * Given an array of integers, find the subset of non-adjacent elements with the maximum sum.
 * Calculate the sum of that subset. It is possible that the maximum sum is , the case when all
 * elements are negative.
 */
public class MaxSubsetSum {
    public static int maxSubsetSum(int[] arr) {
        int sum = 0;
        int current_sum = 0;
        int next_sum = 0;

        for(int i = 0; i < arr.length; i++) {
            next_sum = Math.max(sum, current_sum);
            current_sum = sum + arr[i];
            sum = next_sum;
        }

        return Math.max(sum, current_sum);
    }
}
