1. Problem

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
2. Approach

Find the middle, reverse the second half, and compare:

    Use slow and fast pointers to locate the middle of the linked list.

    Reverse the second half of the list starting from the slow pointer.

    Compare the nodes of the first half and the reversed second half. If any values differ, return false.
3. Time complexity O(n);
4. space complexity O(1);
5.  No, $O(n)$ time and $O(1)$ space is optimal.
