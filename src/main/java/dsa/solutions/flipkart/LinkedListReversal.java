package dsa.solutions.flipkart;

public class LinkedListReversal {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            // Store the next node
            next = current.next;
            // Reverse the current node's pointer
            current.next = prev;
            // Move the pointers one step forward
            prev = current;
            current = next;
        }

        return prev;
    }

    // Utility method to convert linked list to a string for testing
    public static String toString(Node head) {
        StringBuilder result = new StringBuilder();
        while (head != null) {
            result.append(head.data).append(" -> ");
            head = head.next;
        }
        result.append("null");
        return result.toString();
    }
}
