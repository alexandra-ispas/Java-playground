package hackerrank;

/**
 * Given pointers to the head nodes of 2 linked lists that merge together at some point, find the
 * node where the two lists merge. The merge point is where both lists point to the same node,
 * i.e. they reference the same memory location. It is guaranteed that the two head nodes will be
 * different, and neither will be NULL. If the lists share a common node, return that node's data value.
 *
 * e.g.:
 * 1
 *   \
 *    2--->3--->NULL
 *   /
 *  1
 *
 *  - iterate through the distance between the bigger and the smaller list
 *  - find the merging point
 *
 */
public class MergePointInLinkedList {

    public static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode it, bigger, smaller;
        int size1 = 0, size2 = 0;

        // find the size of the first list
        it = head1;
        while(it != null) {
            size1++;
            it = it.next;
        }

        // find the size of the second list
        it = head2;
        while(it != null) {
            size2++;
            it = it.next;
        }

        // compute the difference between them
        int diff = Math.abs(size1 - size2);

        if(size1 > size2) {
            bigger = head1;
            smaller = head2;
        } else {
            bigger = head2;
            smaller = head1;
        }

        while(diff > 0) {
            bigger = bigger.next;
            diff--;
        }

        while(bigger != null ) {
            if(bigger == smaller) {
                return bigger.data;
            } else {
                bigger = bigger.next;
                smaller = smaller.next;
            }
        }
        return -1;
    }


    public class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }
}
