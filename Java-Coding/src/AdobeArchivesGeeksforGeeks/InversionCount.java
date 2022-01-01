package AdobeArchivesGeeksforGeeks;

public class InversionCount {

    public static int merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        System.arraycopy ( arr, l, L, 0, n1 );
        System.arraycopy ( arr, m + 1, R, 0, n2 );

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l, count = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
                count += (n2 + 1 - i);
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return count;
    }

    public static int mergeSort (int[] arr, int start, int end) {
        if(start >= end) return - 1;
        int mid = start + (end - start) / 2;
        mergeSort ( arr, start, mid );
        mergeSort ( arr, mid + 1, end );
        return merge(arr, start, mid, end);
    }

    public static int getInversionsNumber(int[] arr) {
//        int counter = 0;                               // O(N^2)
//        for(int i = 0; i < arr.length - 1; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    counter++;
//                }
//            }
//        }
//        return counter;
//        ----------------------------------------------------
        return mergeSort ( arr, 0, arr.length - 1 ); // O(NlogN)
    }
}
