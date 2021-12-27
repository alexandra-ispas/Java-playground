package AdobeArchivesGeeksforGeeks;

/**
 * Given a linked list, write a function to reverse every k nodes
 * (where k is an input to the function).
 */
public class ReverseListInGroupsOfGivenSize {

    public static Node reverse(Node head, int k) {
        if(head == null) {
            return null;
        }
        Node curr = head;
        Node prev = null;
        Node aux = null;
        int counter = 0;
        while(counter < k && curr != null) {
            aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;
            counter ++;
        }
        head.next = reverse ( aux, k );
        return prev;
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
