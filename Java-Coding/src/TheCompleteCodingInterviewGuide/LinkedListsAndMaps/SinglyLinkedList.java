package TheCompleteCodingInterviewGuide.LinkedListsAndMaps;

public class SinglyLinkedListNode {
    private int data;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext (SinglyLinkedListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }
}
