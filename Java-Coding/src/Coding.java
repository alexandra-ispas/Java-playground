import AdobeArchivesGeeksforGeeks.CheckIfListIsPalindrome;
import AdobeArchivesGeeksforGeeks.CountWords;
import AdobeArchivesGeeksforGeeks.EquilibriumIndexOfAnArray;
import AdobeArchivesGeeksforGeeks.GetNthNodeFromEndOfTheList;
import AdobeArchivesGeeksforGeeks.MergeSortOnLinkedList;
import AdobeArchivesGeeksforGeeks.MiddleElementFromList;
import AdobeArchivesGeeksforGeeks.MyAtoi;
import AdobeArchivesGeeksforGeeks.RemoveDupsFromSortedLinkedList;
import AdobeArchivesGeeksforGeeks.ReverseListInGroupsOfGivenSize;
import AdobeArchivesGeeksforGeeks.ReverseWordsInAString;
import AdobeArchivesGeeksforGeeks.SearchInSortedAndRotatedArray;
import AdobeArchivesGeeksforGeeks.SortingArray;
import hackerrank.BalancedBracketsPair;

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

        MergeSortOnLinkedList.Node head = new MergeSortOnLinkedList.Node ( 1 );
        MergeSortOnLinkedList.Node head1 = new MergeSortOnLinkedList.Node ( 2 );
        MergeSortOnLinkedList.Node head2 = new MergeSortOnLinkedList.Node ( 3 );
        MergeSortOnLinkedList.Node head3 = new MergeSortOnLinkedList.Node ( 4 );
        MergeSortOnLinkedList.Node head4 = new MergeSortOnLinkedList.Node ( 5 );
        MergeSortOnLinkedList.Node head5 = new MergeSortOnLinkedList.Node ( 2 );
        MergeSortOnLinkedList.Node head6 = new MergeSortOnLinkedList.Node ( 3 );
        MergeSortOnLinkedList.Node head7 = new MergeSortOnLinkedList.Node ( 2 );
        MergeSortOnLinkedList.Node head8 = new MergeSortOnLinkedList.Node ( 1 );
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
//        MergeSortOnLinkedList.Node aux = null;
//        System.out.println (MergeSortOnLinkedList.splitList ( head));
//        System.out.println (head);
        System.out.println ( ReverseWordsInAString.reverseWords ( "ana are multe mere" ) );

        System.out.println ("ceva");
    }
}
