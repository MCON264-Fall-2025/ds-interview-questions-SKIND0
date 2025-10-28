package edu.touro.mcon264.l3_reverse_linkedlist;

public class Main {
    public static void main(String[] args) {
        // Create original list: 1 → 2 → 3 → ... → 9
        ListNode head = LinkedListUtils.createList(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println("Original:");
        LinkedListUtils.printList(head);

        // Reverse iteratively
        ListNode reversedIterative = LinkedListUtils.reverseIterative(head);
        System.out.println("Reversed Iteratively:");
        LinkedListUtils.printList(reversedIterative);

        // Reverse recursively (back to original)
        ListNode reversedRecursive = LinkedListUtils.reverseRecursive(reversedIterative);
        System.out.println("Reversed Recursively:");
        LinkedListUtils.printList(reversedRecursive);
    }


}
