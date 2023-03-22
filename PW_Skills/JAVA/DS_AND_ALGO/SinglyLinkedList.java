package DS_AND_ALGO;

public class SinglyLinkedList {
    private ListNode head;

    public static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create Singly Linked List
        SinglyLinkedList singlyLinkedList = createSinglyLinkedList();

        // Print Singly Linked List
        printSinglyLinkedList(singlyLinkedList);

        // Find the length of Singly Linked List
        findLengthSinglyLinkedList(singlyLinkedList);

        // Insert the node at the beginning of a Singly Linked List
        SinglyLinkedList insertNodeAtStart = insertNodeAtBeginning(singlyLinkedList, 5);
        printSinglyLinkedList(insertNodeAtStart);

    }

    // Create Singly Linked List
    public static SinglyLinkedList createSinglyLinkedList() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        singlyLinkedList.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

        return singlyLinkedList;
    }

    // Print Singly Linked List
    public static void printSinglyLinkedList(SinglyLinkedList singlyLinkedList) {

        ListNode current = singlyLinkedList.head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Find the length of Singly Linked List
    public static void findLengthSinglyLinkedList(SinglyLinkedList singlyLinkedList) {

        int length = 0;
        ListNode current = singlyLinkedList.head;

        while (current != null) {
            length++;
            current = current.next;
        }

        System.out.println("Length of Singly Linked List is " + length);
    }

    // Insert the node at the beginning of a Singly Linked List
    public static SinglyLinkedList insertNodeAtBeginning(SinglyLinkedList singlyLinkedList, int value) {

        ListNode newNode = new ListNode(value);
        newNode.next = singlyLinkedList.head;
        singlyLinkedList.head = newNode;

        return singlyLinkedList;
    }
}
