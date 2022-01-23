package TheCompleteCodingInterviewGuide.SortingAndSearching.challenge3;

/**
 * Consider you’ve been given a data structure representing a sorted list of
 * unknown size (this means that there is no size()or similar method) containing only
 * positive numbers.
 * However, as you can see, there is a method called peekAt() that returns the element
 * at the given index in O(1). If the given index is beyond the bounds of this list, then
 * peekAt() returns -1. Write a snippet of code that returns the index at which an element,
 * p, occurs.
 */
public class Solver {
    public static int getIndex (SizelessList list, int p) {
        int i = 1;
        // O (log n)
        while (list.peekAt ( i ) != -1 && list.peekAt ( i ) < p) {
            i *= 2;
        }

        return binarySearch ( list, p, i / 2, i );
    }
    // O(nlog n)
    public static int binarySearch (SizelessList list, int p, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;
        if (list.peekAt ( mid ) == p) {
            return mid;
        }

        if (list.peekAt ( mid ) < p && list.peekAt ( mid ) != -1) {
            return binarySearch ( list, p, mid + 1, right );
        } else {
            return binarySearch ( list, p, left, mid - 1 );
        }
    }
}
