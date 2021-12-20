package hackerrank;

/**
 * A linked list is said to contain a cycle if any node is visited more than once while traversing
 * the list.
 *
 * It uses 2 iterators: one moves one position at a time, the other one (the fast one) moves 2 positions
 */
public class LinkedListCycle {

    public static boolean hasCycle(SinglyLinkedListNode node) {
        SinglyLinkedListNode it1 = node, it2 = node.next.next;

        while(it1 != null && it2 != null) {
            if(it1 == it2) {
                return true;
            }

            it1 = it1.next;
            it2 = it2.next.next;
        }

        return false;
    }

    public class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }
}
