package AdobeArchivesGeeksforGeeks;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given
 * array. The functions should put all 0s first, then all 1s and all 2s in last.
 */
public class SortingArray {
    public static int[] sortArray(int[] arr) {

//        int zeros = Arrays.stream ( arr )
//                .filter ( (x) -> x == 0 )
//                .boxed ().toList ()
//                .size ();
//        int ones = Arrays.stream ( arr )
//                .filter ( (x) -> x == 1 )
//                .boxed ().toList ()
//                .size ();
//        int twos = Arrays.stream ( arr )
//                .filter ( (x) -> x == 2 )
//                .boxed ().toList ()
//                .size ();

        int zeros = 0, ones = 0, twos = 0;

        for (int value : arr) {
            if (value == 0)
                zeros++;
            else if (value == 1)
                ones++;
            else if (value == 2)
                twos++;
        }

        int[] newArr = new int[zeros + ones + twos];

        int i, j, k;
        for(i = 0; i < zeros; i++)
            newArr[i] = 0;
        for(j = i; j < ones + zeros; j++)
            newArr[j] = 1;
        for(k = j; k < ones + twos + zeros; k++)
            newArr[k] = 2;

        return newArr;
    }
}
