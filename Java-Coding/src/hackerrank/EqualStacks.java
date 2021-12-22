package hackerrank;

import java.util.List;

/**
 * You have three stacks of cylinders where each cylinder has the same diameter, but they may vary
 * in height. You can change the height of a stack by removing and discarding its topmost cylinder
 * any number of times.
 *
 * Find the maximum possible height of the stacks such that all of the stacks are exactly the same
 * height. This means you must remove zero or more cylinders from the top of zero or more of the
 * three stacks until they are all the same height, then return the height.
 */
public class EqualStacks {
    public static int getHeight(List<Integer> h) {
        int height = 0;
        for(int hh : h) {
            height += hh;
        }
        return height;
    }
    public static int equalStacks (List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int height1 = getHeight ( h1 );
        int height2 = getHeight ( h2 );
        int height3 = getHeight ( h3 );

        int idx1 = 0, idx2 = 0, idx3 = 0;

        int minHeight;

        while(true) {
            if(height1 == height2 && height2 == height3) {
                return height1;
            }

            minHeight = Math.min(height1, Math.min(height2, height3));

            while(height1 > minHeight) {
                height1 -= h1.get ( idx1 );
                idx1++;
            }

            while(height2 > minHeight) {
                height2 -= h2.get ( idx2 );
                idx2++;
            }

            while(height3 > minHeight) {
                height3 -= h3.get ( idx3 );
                idx3++;
            }
        }
    }
}
