package AdobeArchivesGeeksforGeeks;

public class MergeSortOnLinkedList {
    public static Node splitList(Node head1) {
        Node fast = head1.next, slow = head1;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println ("middld = " + slow);
        Node head2 = new Node(slow);
        slow.next = null;
        System.out.println ("head1 = " + head1);
        System.out.println ("head2 = " + head2);

        return head2;
    }

//    public static void merge(Node h1, Node h2) {
//
//    }

//    public static Node mergeSort(Node head) {
//        if(head == null || head.next == null) {
//            return head;
//        } else {
//            Node second = null;
//            splitList ( head, second );
//            mergeSort ( head )
//        }
//        return null;
//
//    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node node) {
            Node it = node.next;
            Node result = new Node ( node.value );
            while(it != null) {
                result.next = new Node ( it.value );
                result = result.next;
                it = it.next;
            }
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
