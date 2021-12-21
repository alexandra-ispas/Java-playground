package challenge7;

/**
 * Consider a sorted array of n elements that allows duplicates. An index k is
 * magic if array[k] = k. Write a recursive algorithm that finds the first magic index.
 */
public class MagicIndex {

    public static int findMagicIndex(int[] arr) {
        return findMagicIndexHelper ( arr, 0, arr.length - 1 );
    }

    public static int findMagicIndexHelper(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }

        int middle = start + (end - start) / 2;
        if(arr[middle] == middle) {
            return middle;
        }

        int left = findMagicIndexHelper ( arr, start, middle - 1 );
        if(left != -1) return left;

        int right = findMagicIndexHelper ( arr, middle + 1, end );
        if(right != -1) return right;

        return -1;
    }

}
