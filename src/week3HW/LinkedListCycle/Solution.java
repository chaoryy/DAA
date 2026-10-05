package week3HW.LinkedListCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode pos0 = head;
        ListNode pos1 = head;
        while (pos1 != null && pos1.next != null) {
            pos0 = pos0.next;
            pos1 = pos1.next.next;
            if (pos1 == pos0) return true;
        }
        return false;
    }
}