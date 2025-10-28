package edu.touro.mcon264.l3_reverse_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtils {
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
        //builds a linked list and uses dummy nodes. returns the head of the new list.
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
        //prints the values from the linked list.
    }

    public static ListNode reverseIterative(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        //going through each node of the linked list.
        while (curr != null) {
            //store next
            next = curr.next;

            //reverse current node's next pointer
            curr.next = prev;

            //move pointers one position ahead
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public static ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) return head;

        //reverse the rest of the linked list
        //first element at the end.
        ListNode newHead = reverseRecursive(head.next);

        //make the current head as the last node of the remaining linked list.
        head.next.next = head;

        //update next of the current head to null
        head.next = null;
        return newHead;
        //reverses using recursion.
    }
    public static int[] toArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
