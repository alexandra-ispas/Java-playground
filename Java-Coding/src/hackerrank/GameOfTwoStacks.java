package hackerrank;

import java.util.List;

/**
 * Alexa has two stacks of non-negative integers, stack a[n] and stack b[m] where index 0 denotes
 * the top of the stack. Alexa challenges Nick to play the following game:
 *
 * In each move, Nick can remove one integer from the top of either stack a or stack b.
 * Nick keeps a running sum of the integers he removes from the two stacks.
 * Nick is disqualified from the game if, at any point, his running sum becomes greater than some
 * integer maxSum given at the beginning of the game.
 * Nick's final score is the total number of integers he has removed from the two stacks.
 */

public class GameOfTwoStacks {
    public static int gameOfStacks(List<Integer> s1, List<Integer> s2, int maxSum) {
        int counter = 0;
        int sum = 0;
        int idx1 = 0, idx2 = 0;

        while (idx1 < s1.size () && sum + s1.get ( idx1 ) <= maxSum) {
            sum += s1.get ( idx1 );
            idx1++;
        }

        counter = idx1;

        while(idx2 < s2.size ()) {
            sum += s2.get ( idx2 );
            idx2++;

            while (idx1 > 0 && sum > maxSum) {
                idx1--;
                sum -= s1.get ( idx1 );
            }

            if(sum > maxSum) {
                break;
            }

            counter = Math.max ( counter, idx1 + idx2 );
        }

        return counter;
    }
}
