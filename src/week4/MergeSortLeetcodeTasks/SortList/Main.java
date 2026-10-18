package week4.MergeSortLeetcodeTasks.SortList;

import week4.MergeSortLeetcodeTasks.SortAnArray.SortList.ListNode;

public class Main {
    // Вспомогательный метод для красивого вывода связного списка в консоль
    public static void printList(week4.MergeSortLeetcodeTasks.SortAnArray.SortList.ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    // Вспомогательный метод для быстрого создания связного списка из массива чисел
    public static ListNode createList(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Тест 1: Неотсортированный список с четным количеством элементов
        int[] input1 = {4, 2, 1, 3};
        ListNode head1 = createList(input1);

        printList(head1);

        head1 = solution.sortList(head1);

        printList(head1);
        System.out.println("-----------------------------------");

        // Тест 2: Список с нечетным количеством элементов и отрицательными числами
        int[] input2 = {-1, 5, 3, 4, 0};
        ListNode head2 = createList(input2);
        printList(head2);

        head2 = solution.sortList(head2);

        printList(head2);
    }
}