1. Problem

Given the head of a linked list and an integer val, remove all nodes of the linked list that have Node.val == val, and return the new head.
2. Approach

Iterative traversal using a dummy node:

    Create a dummy node pointing to head to safely handle edge cases where the head node itself must be removed.

    Use a curr pointer starting at dummy.

    While curr.next != null, if curr.next.val == val, bypass the node by setting curr.next = curr.next.next. Otherwise, advance curr = curr.next.

3. Time complexity O(n);
4. Space complexity O(1);
5. I've checked for the better sol in some tutorials and find out that this is the most optimal sol.