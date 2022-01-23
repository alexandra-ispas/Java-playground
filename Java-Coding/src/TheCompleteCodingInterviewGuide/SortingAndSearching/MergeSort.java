package TheCompleteCodingInterviewGuide.SortingAndSearching;

import java.util.Arrays;

/**
 * O(nlog n)
 */
public class MergeSort {
    public static void sort (int[] arr) {
        sortHelper ( arr, 0, arr.length - 1 );
    }

    public static void merge (int[] arr, int l1, int r1, int l2, int r2) {
        int n1 = r1 - l1 + 1;
        int n2 = r2 - l2 + 1;

        int[] L = Arrays.copyOfRange (arr, l1, r1 + 1);
        int[] R = Arrays.copyOfRange ( arr, l2, r2 + 1 );

        int i = 0, j = 0;
        int k = l1;

        while (i < n1 && j < n2) {
            if ( L[i] <= R[j] ) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while(j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void sortHelper (int[] arr, int l, int r) {
        if (l == r) {
            return;
        }

        int mid = l + (r - l) / 2;

        sortHelper ( arr, l, mid );
        sortHelper ( arr, mid + 1, r );
        merge ( arr, l, mid, mid + 1, r );
    }
}
