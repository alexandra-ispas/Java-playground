package AdobeArchivesGeeksforGeeks;

public class MiddleElementFromList {

    public static Node getMiddleNode (Node head) {
        if(head.next == null) return head;

        Node slower = head, faster = head;
        while (faster != null) {
            slower = slower.next;
            faster = faster.next.next;
        }

        return slower;
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
