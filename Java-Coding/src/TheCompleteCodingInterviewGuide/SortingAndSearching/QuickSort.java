package TheCompleteCodingInterviewGuide.SortingAndSearching;

/**
 * best case O(n log n), average case O(n
 * log n), worst case O(n2). The space complexity is O(log n) or O(n).
 */
public class QuickSort {
    public static void sort (int[] arr, int left, int right) {
        if (left < right) {
            int m = partition (arr, left, right);
            sort ( arr, left, m - 1 );
            sort ( arr, m + 1, right);
        }
    }

    public static int partition (int[] arr, int left, int right) {
        // choose pivot
        int p = arr[right];
        int m = left;
        for ( int i = m; i < right; i++ ) {
            if ( arr[i] <= p ) {
                int aux = arr[i];
                arr[i] = arr[m];
                arr[m] = aux;

                m++;
            }
        }

        int aux = arr[right];
        arr[right] = arr[m];
        arr[m] = aux;

        return m;
    }
}
