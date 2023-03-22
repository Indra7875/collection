package DS_AND_ALGO;

// How to implement a Singly Linked List in Java

public class SinglyLinkedListImpl {
    private ListNode head;

    public static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
