package TheCompleteCodingInterviewGuide.SortingAndSearching;

import java.util.stream.IntStream;

/**
 * O(nlog n)
 */
public class HeapSort {
    public static void sort(int[] arr) {
        int n = arr.length, i;

        // build the corresponding max-heap
        // arr[0] = max(arr)
        for(i = n / 2; i >= 0; i--) {
            heapify ( arr, n, i );
        }
        int aux;
        while (n > 1) {
            aux = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = aux;

            n--;
            heapify ( arr, n, 0 );
        }

    }

    public static void heapify (int[] arr, int n, int i) {
        int left_index = i * 2 + 1;
        int right_index = i * 2 + 2;

        int bigger;
        if(left_index < n && arr[left_index] > arr[i]) {
            bigger = left_index;
        } else {
            bigger = i;
        }

        if(right_index < n && arr[right_index] > arr[bigger]) {
            bigger = right_index;
        }

        if(bigger != i) {
            int aux = arr[i];
            arr[i] = arr[bigger];
            arr[bigger] = aux;

            heapify ( arr, n, bigger );
        }
    }
}
