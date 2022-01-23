package TheCompleteCodingInterviewGuide.RecursionAndDynamicProgramming.challenge13;

/**
 * A person walks up a staircase. They can hop either one step, two steps, or three
 * steps at a time. Count the number of possible ways they can reach the top of the staircase.
 */

public class Staircase {
    public static int steps (int n) {
        int[] cache = new int[n + 1];
        return stepsHelper ( n, cache );
    }

    public static int stepsHelper (int n, int[] cache) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (cache[n] > 0) return  cache[n];

        cache[n] = stepsHelper ( n - 1, cache ) +
                stepsHelper ( n - 2, cache ) +
                stepsHelper ( n - 3, cache );

        return cache[n];
    }

}
