package TheCompleteCodingInterviewGuide.SortingAndSearching.challenge4;

public final class SinglyLinkedList {

    private static final class Node {
        private int data;
        private Node next;

        @Override
        public String toString() {
            return " " + data + " ";
        }
    }

    private Node head;
    public void insertFirst(int data) {
        Node newNode = new Node ();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void sort() {
        head = sort ( head );
    }

    private Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fastRunner = head.next;
        Node slowRunner = head;
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        Node head1 = head;
        Node head2 = slowRunner.next;
        slowRunner.next = null;

        head1 = sort ( head1 );
        head2 = sort ( head2 );
        return merge ( head1, head2 );
    }

    private Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        Node merged;
        if (head1.data <= head2.data) {
            merged = head1;
            merged.next = merge ( head1.next, head2 );
        } else {
            merged = head2;
            merged.next = merge ( head1, head2.next );
        }
        return merged;
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print ( currentNode );
            currentNode = currentNode.next;
        }
        System.out.println ();
    }
}