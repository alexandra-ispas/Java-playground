package TheCompleteCodingInterviewGuide.SortingAndSearching.challenge1;

/**
 * Consider you’ve been given two sorted arrays, p and q. The p array is large
 * enough to fit q at the end of it. Write a snippet of code that merges p and q in a sorted
 * order.
 */
public class MergingTwoSortedArrays {
    public static void merge (int[] p, int[] q) {
        int i = q.length - 1, j = p.length - q.length - 1;
        int k = p.length - 1;

        if (j < 0) {
            throw new IllegalArgumentException ( " p cannot fit q " );
        }

        while (i >= 0 && j >= 0) {
            if (q[i] >= p[j]) {
                p[k--] = q[i--];
            } else {
                p[k--] = p[j--];
            }
        }
    }
}
