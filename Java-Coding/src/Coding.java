import AdobeArchivesGeeksforGeeks.MyAtoi;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge10.MatrixWIthZeros;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge3.ReplaceWhitespaces;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge4.OneEditAway;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge5.ShrinkString;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge6.ExtractIntegers;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge7.ExtractCodePointsOfSurrogatePairs;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge8.StringIsRotation;
import TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge9.RotateMatrix;

import java.util.Arrays;

public class Coding {
    public static void main(String[] args) throws MyAtoi.AtoiException {
//        int m = 5;
//        int n = 5;
//        boolean[][] grid = new boolean[6][6];
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                grid[i][j] = i == 2 && j >= 2;
//            }
//        }
//        grid[3][5] = true;
//        Set<Point> path = new HashSet<> ();
//        System.out.println ("Robot grid problem: " + RobotGrid.SolveRobotGrid ( grid, m, n, path ) + "  " + path);
//
//        int[] range = IntStream.range ( 1, n + 1 ).toArray ();
//        List<Integer> cities_list = Arrays.stream(range).boxed().toList();
//        System.out.print ( cities_list );

//        Hanoi.TowerOfHanoi (3, 'A', 'B', 'C');

//        System.out.println ( JosephusRecursive.josephus ( 15, 3 ));
//        JosephusIterative.josephus ( 15, 3 );


        int r = 5, c  = 5;
        int[][] grid = new int[r][c];
//
//        grid[0][0] = 1;
//        grid[0][1] = 2;
//        grid[0][2] = 3;
//        grid[0][3] = 2;
//        grid[0][4] = 2;
//
//        grid[1][0] = 2;
//        grid[1][1] = 1;
//        grid[1][2] = 2;
//        grid[1][3] = 3;
//        grid[1][4] = 3;
//
//        grid[2][0] = 2;
//        grid[2][1] = 3;
//        grid[2][2] = 3;
//        grid[2][3] = 3;
//        grid[2][4] = 3;
//
//        grid[3][0] = 3;
//        grid[3][1] = 2;
//        grid[3][2] = 1;
//        grid[3][3] = 1;
//        grid[3][4] = 3;
//
//        grid[4][0] = 1;
//        grid[4][1] = 3;
//        grid[4][2] = 2;
//        grid[4][3] = 3;
//        grid[4][4] = 3;
//
//        ColorSpots.colorSpots ( grid, r, c );

//        int[] arr = new int[12];
//
//        for(int i = 0; i < 12; i++) {
//            arr[i] = 30 - i;
//        }


//        arr[6] = 6;

//        System.out.println ( MagicIndex.findMagicIndex ( arr ) );



//        grid[0][0] = 5;
//        grid[0][1] = 4;
//        grid[0][2] = 3;
//        grid[0][3] = 4;
//        grid[0][4] = 5;
//
//        grid[1][0] = 4;
//        grid[1][1] = 1;
//        grid[1][2] = 1;
//        grid[1][3] = 3;
//        grid[1][4] = 4;
//
//        grid[2][0] = 4;
//        grid[2][1] = 1;
//        grid[2][2] = 1;
//        grid[2][3] = 3;
//        grid[2][4] = 3;
//
//        grid[3][0] = 3;
//        grid[3][1] = 2;
//        grid[3][2] = 2;
//        grid[3][3] = 3;
//        grid[3][4] = 2;
//
//        grid[4][0] = 2;
//        grid[4][1] = 1;
//        grid[4][2] = 1;
//        grid[4][3] = 2;
//        grid[4][4] = 1;
//
//        TheFallingBall.displayPath ( grid, r, c, 0, 4 );

//        System.out.println ( BalancedBracketsPair.isBalanced ( "{[()}" ) );

//        int[] arr = new int[7];
//        arr[0] = 2;
//        arr[1] = 1;
//        arr[2] = 0;
//        arr[3] = 0;
//        arr[4] = 0;
//        arr[5] = 2;
//        arr[6] = 1;
//
//        System.out.println ( Arrays.toString ( SortingArray.sortArray ( arr ) ) );

//        RemoveDupsFromSortedLinkedList.Node head = new RemoveDupsFromSortedLinkedList.Node ( 1 );
//        RemoveDupsFromSortedLinkedList.Node head1 = new RemoveDupsFromSortedLinkedList.Node ( 2 );
//        RemoveDupsFromSortedLinkedList.Node head2 = new RemoveDupsFromSortedLinkedList.Node ( 2 );
//        RemoveDupsFromSortedLinkedList.Node head3 = new RemoveDupsFromSortedLinkedList.Node ( 3 );
//        RemoveDupsFromSortedLinkedList.Node head4 = new RemoveDupsFromSortedLinkedList.Node ( 3 );
//        RemoveDupsFromSortedLinkedList.Node head5 = new RemoveDupsFromSortedLinkedList.Node ( 4 );
//        RemoveDupsFromSortedLinkedList.Node head6 = new RemoveDupsFromSortedLinkedList.Node ( 5 );
//        RemoveDupsFromSortedLinkedList.Node head7 = new RemoveDupsFromSortedLinkedList.Node ( 9 );
//
//
//        head.next = head1;
//        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
//        head6.next = head7;
//
//        System.out.println (RemoveDupsFromSortedLinkedList.remove ( head ));

//        GetNthNodeFromEndOfTheList.Node head = new GetNthNodeFromEndOfTheList.Node ( 1 );
//        GetNthNodeFromEndOfTheList.Node head1 = new GetNthNodeFromEndOfTheList.Node ( 2 );
//        GetNthNodeFromEndOfTheList.Node head2 = new GetNthNodeFromEndOfTheList.Node ( 2 );
//        GetNthNodeFromEndOfTheList.Node head3 = new GetNthNodeFromEndOfTheList.Node ( 3 );
//        GetNthNodeFromEndOfTheList.Node head4 = new GetNthNodeFromEndOfTheList.Node ( 3 );
//        GetNthNodeFromEndOfTheList.Node head5 = new GetNthNodeFromEndOfTheList.Node ( 4 );
//        GetNthNodeFromEndOfTheList.Node head6 = new GetNthNodeFromEndOfTheList.Node ( 5 );
//        GetNthNodeFromEndOfTheList.Node head7 = new GetNthNodeFromEndOfTheList.Node ( 9 );
//
//        head.next = head1;
//        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
//        head6.next = head7;
//
//
//        System.out.println (GetNthNodeFromEndOfTheList.getNode ( head, 3 ));

//        MiddleElementFromList.Node head = new MiddleElementFromList.Node ( 1 );
//        MiddleElementFromList.Node head1 = new MiddleElementFromList.Node ( 2 );
//        MiddleElementFromList.Node head2 = new MiddleElementFromList.Node ( 2 );
//        MiddleElementFromList.Node head3 = new MiddleElementFromList.Node ( 3 );
//        MiddleElementFromList.Node head4 = new MiddleElementFromList.Node ( 12 );
//        MiddleElementFromList.Node head5 = new MiddleElementFromList.Node ( 4 );
//        MiddleElementFromList.Node head6 = new MiddleElementFromList.Node ( 5 );
//        MiddleElementFromList.Node head7 = new MiddleElementFromList.Node ( 9 );
//
//        head.next = head1;
//        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
//        head6.next = head7;
//
//
//        System.out.println (MiddleElementFromList.getMiddleNode ( head ));

//        System.out.println ( MyAtoi._atoi ("-8493948343403493041234") );

//        int[] arr = new int[6];
//        arr[0] = 3;
//        arr[1] = 4;
//        arr[2] = 5;
//        arr[3] = 1;
//        arr[4] = 2;
//        System.out.println ( SearchInSortedAndRotatedArray.find ( arr, 5 ) );

//        System.out.println ( ReverseWordsInAString.reverseWords ( "ana are multe mere" ) );

//        System.out.println ( ReachNthStair.climb ( 4 ) );

//        int[] arr = new int[4];
//        arr[0] = 8;
//        arr[1] = 4;
//        arr[2] = 2;
//        arr[3] = 1;
//
//        System.out.println (InversionCount.getInversionsNumber ( arr ));
//        System.out.println ( FindTheKthNumberWithGivenPrimeFactors.kth ( 4 ) );

//        System.out.println ( UniqueCharacters.hasUniqueCharacters ( "asdfghj" ) );
//
//        System.out.println ( UniqueCharacters.hasUniqueCharacters ( "ana" ) );

//        System.out.println ( ReplaceWhitespaces.replace ( "ana are mere sau altceva".toCharArray () ) );

//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "cana" ) );
//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "na" ) );
//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "ana" ) );
//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "bna" ) );
//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "a" ) );
//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "canab" ) );
//        System.out.println ( OneEditAway.isOneEditAway ( "ana", "anac" ) );

//        System.out.println ( ShrinkString.shrink ( "abbb vvvv s rttt rr eeee f" ) );
//        System.out.println ( ShrinkString.shrink ( "abcdefghij" ) );

//        System.out.println ( ExtractIntegers.extractInteger ( "cv dd 4 k 2321 2 11 k4k2 66 4d" ) );

//        System.out.println (String.valueOf(Character.toChars(128149)));

//        char[] musicalScore = new char[]{'\uD83C', '\uDFBC'};
//        char[] smileyFace = new char[]{'\uD83D', '\uDE0D'};
//        char[] twoHearts = new char[]{'\uD83D', '\uDC95'};
//        char[] cyrillicZhe = new char[]{'\u04DC'};
//
//        String str = "is" + String.valueOf(cyrillicZhe) + "zhe"
//                + String.valueOf(twoHearts) + "two hearts"
//                + String.valueOf(smileyFace) + "smiley face and, "
//                + String.valueOf(musicalScore) + "musical score";
//        System.out.println ( ExtractCodePointsOfSurrogatePairs.getCodePoints ( str ) );

//        System.out.println ( StringIsRotation.isRotation ( "helloworld", "orldhellow" ) );

//        int[][] matrix = {{1, 2, 3, 4, 0, 5, 6, 7},
//                        {8, 9, 10, 11, 12, 13, 14, 15},
//                        {16, 17, 18, 19, 20, 21, 0, 22},
//                        {23, 24, 25, 26, 27, 28, 29, 30},
//                        {31, 32, 33, 34, 35, 36, 37, 38}};
//        System.out.println ( Arrays.deepToString (matrix));
//        MatrixWIthZeros.modifyMatrix ( matrix );
//        System.out.println ( Arrays.deepToString (matrix));



    }
}
