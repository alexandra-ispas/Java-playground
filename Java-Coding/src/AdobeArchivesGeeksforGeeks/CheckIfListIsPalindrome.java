package AdobeArchivesGeeksforGeeks;

import java.util.Stack;

/**
 * Given a singly linked list of characters, write a function that returns true if the given list
 * is a palindrome, else false.
 */
public class CheckIfListIsPalindrome {

    public static boolean isPalindrome(Node head) {
        Stack<Node> stack = new Stack<> ();
        Node fast = head, slow = head;

        while(fast != null && fast.next != null) {
            stack.push ( slow );
            slow = slow.next;
            fast = fast.next.next;
        }

        // for odd length
        if(stack.peek ().value != slow.value) {
            slow = slow.next;
        }

        while(! stack.empty ()) {
            if(stack.pop ().value != slow.value) {
                return false;
            }
            slow = slow.next;
        }
        return true;
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
