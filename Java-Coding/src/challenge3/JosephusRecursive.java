package challenge3;

/**
 * Consider a group of n men arranged in a circle (1, 2, 3, ..., n). Every kth man will
 * be killed around the circle until only one survivor remains. Write an algorithm that finds
 * the k position of this survivor. This is known as the Josephus problem.
 */
public class JosephusRecursive {
    public static int josephus(int n, int k) {
        if(n == 1) return n;

        return (josephus ( n - 1, k ) + k - 1) % n + 1;
    }
}
