package TheCompleteCodingInterviewGuide.MathematicsAndPuzzles.challenge5;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Design an algorithm to find the kth number where the only prime factors are 3,
 * 5, and 7.
 *
 * Having a list of numbers whose only prime factors are 3, 5, and 7 means a list
 * that looks as follows: 1, 3, 5, 7, 9, 15, 21, 25, and so on. Or, to be more suggestive, it can
 */
public class FindTheKthNumberWithGivenPrimeFactors {

    public static int kth(int k) {
        int minElem = 1;
        Queue<Integer> queue3 = new PriorityQueue<> ();
        Queue<Integer> queue5 = new PriorityQueue<> ();
        Queue<Integer> queue7 = new PriorityQueue<> ();

        for(int i = 1; i < k; i++) {
            queue3.offer ( minElem * 3 );
            queue5.offer ( minElem * 5 );
            queue7.offer ( minElem * 7 );

            minElem = Math.min(queue3.peek (), Math.min(queue5.peek (), queue7.peek ()));

            if(minElem == queue3.peek ()) {
                queue3.poll ();
            } else if(minElem == queue5.peek ()) {
                queue5.poll ();
            } else if(minElem == queue7.peek ()) {
                queue7.poll ();
            }
        }
        return minElem;
    }
}
