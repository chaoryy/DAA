1. Problem

Given the heads of two singly linked-lists, headA and headB, return the node at which the two lists intersect. If they do not intersect, return null.

2. ApproachTwo-pointer switching traversal:Initialize two pointers, pA at headA and pB at headB.   Traverse both lists node by node. When a pointer reaches null, redirect it to the head of the opposite list.If the lists intersect, both pointers will travel equal distances (lengthA + lengthB) and meet at the intersection node. If they do not intersect, both will reach null simultaneously.
3. Time complexity O(n+m);
4. space complexity O(1);
5. O(n+m) and O(1) is optimal solution