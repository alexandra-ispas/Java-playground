package AdobeArchivesGeeksforGeeks;

/**
 * suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
 * So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the
 * rotated array in O(log n) time.
 */
public class SearchInSortedAndRotatedArray {

    public static int find(int[] arr, int elem) {
        if(arr.length == 1 && arr[0] != elem) return -1;
        if(arr.length == 1 && arr[0] == elem) return 0;

        int pivot = -1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                pivot = i + 1;
                break;
            }
        }

        int left = binarySearch ( arr, 0, pivot - 1, elem );
        int right = binarySearch ( arr, pivot, arr.length - 1, elem );

        if(left != -1) {
            return left;
        } else return right;

    }

    public static int binarySearch(int[] arr, int start, int end, int elem) {
        if(start > end) return -1;

        int mid = end + (start - end) / 2;

        if(arr[mid] == elem) {
            return mid;
        }

        int left = binarySearch ( arr, start, mid - 1, elem );
        int right = binarySearch ( arr, mid + 1, end, elem );

        if (left != -1) {
            return left;
        }
        return right;
    }

}
