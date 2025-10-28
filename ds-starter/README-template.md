#  README Template

##  Problem Statement
Describe the problem in your own words.
Example:
> Given the head of a singly linked list, reverse the list so that the last node becomes the new head and all links point backward.
Implement both iterative and recursive approaches to reverse the list.


---

##  Assumptions
State any assumptions you made while solving the problem.
Examples:
- The list may be empty (head = null).
- Each node contains an integer value and a reference to the next node.
- The input list is singly linked (no backward pointers).
- The recursive solution may use extra space due to call stack frames.
- The iterative solution must use O(1) extra space.

🧠 Conceptual Solution
Iterative Approach
- Use three pointers: prev, curr, and next.
- Traverse the list while curr is not null.
- At each step, flip curr.next to point to prev.
- Move all pointers forward: prev = curr, curr = next.
- When traversal ends, prev will be the new head of the reversed list.


  Recursive Approach
- Base case: if head is null or head.next is null, return head.
- Recursively call reverseRecursive(head.next) to reverse the rest of the list.
- Flip the link: make head.next.next = head and head.next = null.
- Return the new head from the deepest recursive call.


📎 Example
Original List:
1 → 2 → 3 → null
Reversed Iteratively:
3 → 2 → 1 → null
✅ Expected output: [3, 2, 1]
Reversed Recursively:
Input: 4 → 5 → 6 → null
Output: 6 → 5 → 4 → null
✅ Expected output: [6, 5, 4]
Explanation:
In both cases, the list is reversed correctly. The iterative method walks through the list and flips links one by one. The recursive method breaks the problem down to the last node and rebuilds the reversed list during the return phase.

Let me know if you want a matching slide deck or speaker notes to go with this!


---

##  Conceptual Solution
Explain **how** your algorithm works at a high level — no code, just logic.

- Iterative reversal:
  Walk through the list using three pointers: one to track the previous node, one for the current node, and one for the next node.
  At each step, flip the current node’s link to point backward, then move all pointers forward.
  Repeat until the end of the list is reached. The last node visited becomes the new head.
- Recursive reversal:
  Break the problem into smaller pieces by calling the reversal function on the next node.
  Once the base case is reached (last node), begin returning from each call.
  As you unwind, flip the link so the next node points back to the current, and cut the original forward link.
  The deepest call returns the new head of the reversed list.


---

##  Example
Provide one illustrative example of your choice.
Include the input, expected output, and a short explanation.

Example:
Original:
1 2 3 4 5 6 7 8 9
Reversed Iteratively:
9 8 7 6 5 4 3 2 1
    this is the expected output!
Reversed Recursively:
1 2 3 4 5 6 7 8 9
    this is also the expected output!
explanation: the linked list here reverses both times which is what the program should be doing!