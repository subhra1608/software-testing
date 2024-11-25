package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListReversalTest {

    @Test
    void reverseLinkedList() {
        // Test case 1: Reversing a linked list with multiple elements
        LinkedListReversal.Node head = new LinkedListReversal.Node(1);
        head.next = new LinkedListReversal.Node(2);
        head.next.next = new LinkedListReversal.Node(3);
        head.next.next.next = new LinkedListReversal.Node(4);
        LinkedListReversal.Node reversed = LinkedListReversal.reverseLinkedList(head);
        assertEquals("4 -> 3 -> 2 -> 1 -> null", LinkedListReversal.toString(reversed));

        // Test case 2: Single element linked list
        LinkedListReversal.Node single = new LinkedListReversal.Node(5);
        LinkedListReversal.Node singleReversed = LinkedListReversal.reverseLinkedList(single);
        assertEquals("5 -> null", LinkedListReversal.toString(singleReversed));

        // Test case 3: Empty linked list
        LinkedListReversal.Node empty = null;
        LinkedListReversal.Node emptyReversed = LinkedListReversal.reverseLinkedList(empty);
        assertEquals("null", LinkedListReversal.toString(emptyReversed));

        // Test case 4: Linked list with two elements
        LinkedListReversal.Node twoNodeHead = new LinkedListReversal.Node(10);
        twoNodeHead.next = new LinkedListReversal.Node(20);
        LinkedListReversal.Node twoNodeReversed = LinkedListReversal.reverseLinkedList(twoNodeHead);
        assertEquals("20 -> 10 -> null", LinkedListReversal.toString(twoNodeReversed));

        // Test case 5: Linked list with all identical elements
        LinkedListReversal.Node identicalHead = new LinkedListReversal.Node(7);
        identicalHead.next = new LinkedListReversal.Node(7);
        identicalHead.next.next = new LinkedListReversal.Node(7);
        LinkedListReversal.Node identicalReversed = LinkedListReversal.reverseLinkedList(identicalHead);
        assertEquals("7 -> 7 -> 7 -> null", LinkedListReversal.toString(identicalReversed));
    }
}
