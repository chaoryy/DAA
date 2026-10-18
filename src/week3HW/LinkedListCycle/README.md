# Cycle Detection in a Linked List

## 1. PROBLEM
    We are given the head of a linked list, where each node is an instance of the ListNode class containing an integer value and a pointer to the next node.
    We need to determine whether the list contains a cycle. A cycle occurs if some node in the list can be reached again by continuously following the next pointer, meaning the list never ends in null.

## 2. APPROACH
    I used Floyd's Cycle-Finding Algorithm (also known as the "Tortoise and the Hare" algorithm).
    First, I handle base cases: if the head is null or head.next is null, a cycle is impossible, so I return false.
    Then, I initialize two pointers, slow and fast, both starting at the head of the list.
    I run a while loop as long as fast and fast.next are not null.
    In each iteration:
    - slow moves forward by 1 node (slow = slow.next)
    - fast moves forward by 2 nodes (fast = fast.next.next)
    
    If the list has a cycle, fast will eventually enter the loop first and slow will follow. Since fast moves faster, it will eventually catch up and equal slow (slow == fast). If they meet, I return true.
    If fast or fast.next becomes null, it means we reached the end of the list, so there is no cycle, and I return false.

    TRACING EXAMPLE:
    List: 3 -> 2 -> 0 -> -4
                 ^          |
                 |__________|  (tail -4 points back to node 2)

    Initial state:
    slow = node(3), fast = node(3)

    Iteration 1:
    slow moves to node(2)
    fast moves to node(0)
    slow != fast

    Iteration 2:
    slow moves to node(0)
    fast moves to node(2)  (moves from 0 -> -4 -> 2)
    slow != fast

    Iteration 3:
    slow moves to node(-4)
    fast moves to node(-4) (moves from 2 -> 0 -> -4)
    slow == fast -> Match found! Return true.

## 3. TIME COMPLEXITY
    Time Complexity: O(N)
    Where N is the total number of nodes in the linked list. 
    If there is no cycle, the fast pointer reaches the end of the list in N / 2 steps.
    If there is a cycle, the fast pointer enters the cycle first, and once the slow pointer enters, fast catches up to slow within a few loops (at most the length of the cycle). Thus, the total time spent is proportional to the number of nodes.

## 4. SPACE COMPLEXITY
    Space Complexity: O(1)
    The algorithm only uses two pointers (slow and fast) regardless of the size of the input list. No extra memory or data structures (like HashSets or arrays) are created.

## 5. REFLECTION / IMPROVEMENT
    Is there a more efficient approach?
    No, this approach is already optimal in terms of both time complexity O(N) and space complexity O(1).

    What would you need to change?
    Nothing needs to be changed for cycle detection. However, if the problem required finding the exact starting node of the cycle (not just returning true/false), I would need to add a second step: once slow and fast meet, reset slow back to head, and then move both slow and fast 1 step at a time until they meet again.

    What complexity could the improved solution achieve?
    The time complexity would remain O(N) and space complexity would stay O(1).