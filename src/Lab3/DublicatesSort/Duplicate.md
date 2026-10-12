1. Problem 
Given the head of a sorted linked list, delete all duplicatesGiven the head of a sorted linked list, delete all duplicates
2. Approach

Single-pointer iterative traversal:

    Initialize a curr pointer at head.

    Compare curr.val with curr.next.val. If they are equal, remove the duplicate node by pointing curr.next to curr.next.next.

    Otherwise, advance curr to the next node.
3. Time complexity: O(n);
4. Space complexity O(1):
5. I belive that this solution is the most optimal way.