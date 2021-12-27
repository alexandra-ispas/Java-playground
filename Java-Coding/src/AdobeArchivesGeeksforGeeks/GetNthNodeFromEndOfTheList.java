package AdobeArchivesGeeksforGeeks;

public class GetNthNodeFromEndOfTheList {

    public static Node getNode (Node head, int N) {
        if(head.next == null) {
            if(N == 0) {
                return head;
            } else {
                return null;
            }
        }

        Node it = head;
        int counter = 1;
        while(counter != N) {
            it = it.next;
            counter++;
        }

        Node it2 = head;
        while(it.next != null) {
            it2 = it2.next;
            it = it.next;
        }
        return it2;
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
                    '}';
        }
    }
}
