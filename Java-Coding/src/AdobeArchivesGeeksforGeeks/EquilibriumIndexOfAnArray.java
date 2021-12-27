package AdobeArchivesGeeksforGeeks;

import java.util.Arrays;

/**
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal
 * to the sum of elements at higher indexes. For example, in an array A:
 * Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
 * Output: 3
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */
public class EquilibriumIndexOfAnArray {

    public static int getIndex (int[] arr) {
        int sum = Arrays.stream(arr).sum ();
        int left_sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int right_sum = sum - arr[i] - left_sum;
            if(left_sum == right_sum) {
                return i;
            }
            left_sum += arr[i];
        }

        return -1;
    }
}
