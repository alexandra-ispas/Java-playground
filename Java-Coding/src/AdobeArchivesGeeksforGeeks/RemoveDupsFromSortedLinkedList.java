package AdobeArchivesGeeksforGeeks;

/**
 * Write a function that takes a list sorted in non-decreasing order and deletes any duplicate nodes
 * from the list. The list should only be traversed once.
 */
public class RemoveDupsFromSortedLinkedList {

    // 1 2 3 3 4 4 5 6 7
    public static Node remove (Node head) {
        if(head.next == null) {
            return head;
        }

        Node curr = head.next, prev = head;
        while (curr != null) {
            if(curr.value == prev.value) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }


    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
