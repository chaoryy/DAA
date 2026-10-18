## 1. PROBLEM
    We have two linked lists, that are sorted in non-decresing order. But it is not basic list, it is class called ListNode that have three constructors: 
        1) ListNode(int val) 
        2) ListNode(int val, ListNode next)
        3) ListNode()
    Our list is just bunch if ListNode classes that contains int and link to next ListNode.
    We need to write methond that takes two list and merge it to one linked list.

## 2. APPROACH
    At first i create empty ListNode, than i created second ListNode that links to first one.
    Then I use while loop that runs as long as both lists are not equal to null  (not empty).
    In loop i compare values of two lists, if list1.val is smaller or equal, I connect list.next to list1, and move to next list1 value. if list2.val is smaller, I connect list.next to list2, and move to the next list2 value.
    After this, I move the list pointer forward (list = list.next) to be ready for the next node.
    When one of the list is empty, the loop breaks. I simply connect the remainder of the other non-empty list directly to list.next (since it is already sorted and larger than all processed elements).
    Finally, I return noteList.next, which skips the placeholder and points to the true start of the merged list.

    Here is a step-by-step tracing of how it works with an example:

    Input: 
        list1: 1 -> 3
        list2: 2 -> 4

    Initialization:
        - I create `noteList` (empty ListNode) and `list` that points to `noteList`.
        - `list1` starts at 1, `list2` starts at 2.

    Step 1:
        - Both lists are not null, so loop runs.
        - `list1.val` (1) is smaller than `list2.val` (2).
        - I connect `list.next` to `list1`. 
        - Move `list1` forward (now it is 3).
        - Move `list` pointer forward.
        - State: noteList -> 1

    Step 2:
        - Both lists are still not null.
        - `list2.val` (2) is smaller than `list1.val` (3).
        - I connect `list.next` to `list2`. 
        - Move `list2` forward (now it is 4).
        - Move `list` pointer forward.
        - State: noteList -> 1 -> 2

    Step 3:
        - Both lists are still not null.
        - `list1.val` (3) is smaller than `list2.val` (4).
        - I connect `list.next` to `list1`. 
        - Move `list1` forward (now it is null).
        - Move `list` pointer forward.
        - State: noteList -> 1 -> 2 -> 3

    The loop breaks because `list1` became null.

    Final Step:
        - `list2` still has remaining value (4).
        - I connect `list2` directly to `list.next`.
        - Final state: noteList -> 1 -> 2 -> 3 -> 4 -> null
        - Return `noteList.next` to skip the empty first node.

## 3. TIME COMPLEXITY
    Time Complexity: O(n + m)
    Why: Where n is the number of nodes in list1 and m is the number of nodes in list2. The while loop checks one node at a time. In the worst case, we have to look at every single node from both lists to compare them. Since we visit each node only once, the time grows linearly with the total size of both lists.

    Space Complexity: O(1)
    Why: Because I do not create any new nodes for the elements or use structures like arrays. I just change the links (next pointers) of the existing ListNode classes in place. The only extra memory is for `noteList` and `list` pointers, which take the same small amount of memory regardless of the list size.

## 5. REFLECTION / IMPROVEMENT
    Is there a more efficient approach?
    No, this approach is already the most efficient. We cannot do it faster than O(n + m) because we must check every node to make sure everything is sorted correctly.

    What would you need to change?
    We could use a recursive method instead of a while loop. We would need to change the loop into a method that calls itself with the next nodes.

    What complexity could the improved solution achieve?
    The time complexity would still be O(n + m). But the space complexity would become worse: O(n + m) instead of O(1). This happens because every recursive call stays in the computer memory stack until the end. So the loop approach is better for memory.
