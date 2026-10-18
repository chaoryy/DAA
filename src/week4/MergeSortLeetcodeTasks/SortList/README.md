# 2. Sort List

## 1. Problem
The task is to sort a given singly linked list in ascending order and return its head. The solution must handle lists with up to $5 \cdot 10^4$ nodes efficiently.

## 2. Approach
I implemented the **Merge Sort** algorithm tailored for linked lists, which follows a "divide and conquer" strategy:
1. **Find the Middle:** Use the slow and fast pointer technique (`slow` and `fast`) to find the exact midpoint of the linked list.
2. **Divide:** Split the list into two halves by setting `mid.next = null`.
3. **Conquer:** Recursively apply `sortList` to both the left and right halves until sublists contain 0 or 1 node.
4. **Combine:** Merge the two sorted sublists into a single sorted linked list using a dummy node pointer.

### Step-by-Step Tracing Example
Given `head = [4, 2, 1, 3]`:
* **Divide:**
    * Midpoint separates the list into `[4, 2]` and `[1, 3]`.
    * Further division breaks them down into single nodes: `[4]`, `[2]`, `[1]`, `[3]`.
* **Merge Phase:**
    * Merge `[4]` and `[2]` $\rightarrow$ `[2, 4]`.
    * Merge `[1]` and `[3]` $\rightarrow$ `[1, 3]`.
    * Merge `[2, 4]` and `[1, 3]` $\rightarrow$ compares nodes sequentially, resulting in `[1, 2, 3, 4]`.

### Challenges Faced
Working with pointers instead of array indices required careful management of list boundaries to avoid infinite recursion or `NullPointerException` (especially when splitting lists with an even vs. odd number of nodes). Breaking the link correctly (`mid.next = null`) was crucial to isolate the sublists.

---

## 3. Complexity Analysis

* **Time Complexity:** $O(n \log n)$
    * **Explanation:** The linked list is divided in half recursively $\log n$ times, and at each level, merging the nodes takes linear time $O(n)$. Thus, the total time complexity is $O(n \log n)$.

* **Space Complexity:** $O(\log n)$ (due to recursion stack)
    * **Explanation:** Although no extra data structures (like arrays or lists) are allocated, the top-down recursive implementation uses $O(\log n)$ space on the call stack for the recursion tree. *(Note: Bottom-up iterative Merge Sort can achieve strict $O(1)$ auxiliary space).*

---

## 4. Reflection / Improvement

* **Is there a more efficient approach?**
  The top-down approach runs in $O(n \log n)$ time, which is optimal for comparison-based sorting. However, to strictly satisfy the follow-up constraint of $O(1)$ memory (constant space), a **Bottom-up Iterative Merge Sort** can be used instead of recursion.
* **What would need to be changed?**
  Instead of using recursive calls that consume stack memory, implement loops that iteratively merge sublists of size $1, 2, 4, 8$, etc., using pointer manipulations.
* **What complexity could the improved solution achieve?**
  $O(n \log n)$ time complexity with strict $O(1)$ auxiliary space complexity.