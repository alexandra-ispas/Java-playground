package TheCompleteCodingInterviewGuide.RecursionAndDynamicProgramming.challenge3;

import java.util.ArrayDeque;
import java.util.Queue;

public class JosephusIterative {

    public static void josephus(int n, int k) {
        Queue<Integer> q = new ArrayDeque<> ();

        for(int i = 1; i <= n; i++) {
            q.add ( i );
        }

        while(q.size () > 1) {

            for(int i = 1; i <= k; i++) {
                int head = q.poll ();
                if(i == k) {
                    System.out.println (head + " was eliminated");
                    break;
                }
                q.offer ( head );
            }
        }

        System.out.println (q.poll ());
    }
}
