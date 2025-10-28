package edu.touro.mcon264.l3_reverse_linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testReverseIterative_basic() {
        ListNode head = LinkedListUtils.createList(new int[]{1, 2, 3});
        ListNode reversed = LinkedListUtils.reverseIterative(head);
        assertArrayEquals(new int[]{3, 2, 1}, LinkedListUtils.toArray(reversed));
        //creates a list and reverses it iteratively.
    }

    @Test
    public void testReverseRecursive_basic() {
        ListNode head = LinkedListUtils.createList(new int[]{4, 5, 6});
        ListNode reversed = LinkedListUtils.reverseRecursive(head);
        assertArrayEquals(new int[]{6, 5, 4}, LinkedListUtils.toArray(reversed));
        //creates a list and reverses it recursively.
    }

    @Test
    public void testReverseIterative_emptyList() {
        ListNode head = null;
        assertNull(LinkedListUtils.reverseIterative(head));
        //creates an empty list and confirms that the results are null.
    }

    @Test
    public void testReverseRecursive_emptyList() {
        ListNode head = null;
        assertNull(LinkedListUtils.reverseRecursive(head));
        //same as before tests an empty list, but recursive methods.
    }

    @Test
    public void testReverseIterative_singleNode() {
        ListNode head = new ListNode(42);
        ListNode reversed = LinkedListUtils.reverseIterative(head);
        assertEquals(42, reversed.val);
        assertNull(reversed.next);
        //creates a list with one node. and result is still 42 -> null.
    }

    @Test
    public void testReverseRecursive_singleNode() {
        ListNode head = new ListNode(99);
        ListNode reversed = LinkedListUtils.reverseRecursive(head);
        assertEquals(99, reversed.val);
        assertNull(reversed.next);
        //same test as above, but tests the recursive method.
    }
}