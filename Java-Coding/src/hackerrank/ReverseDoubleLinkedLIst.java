package hackerrank;

/**
 * Given the pointer to the head node of a doubly linked list, reverse the order of the nodes in
 * place. That is, change the next and prev pointers of the nodes so that the direction of the list
 * is reversed. Return a reference to the head node of the reversed list.
 *
 * It means you have to swap the 'next' and 'prev' pointers
 */
public class ReverseDoubleLinkedLIst {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode listNode) {
        DoublyLinkedListNode aux = null, it = listNode;

        while(it != null) {
            DoublyLinkedListNode tmp = it.next;
            it.next = it.prev;
            it.prev = tmp;
            aux = it;
            it = it.prev;
        }

        return aux;
    }

    public class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int data) {
            this.data = data;
        }
    }
}
