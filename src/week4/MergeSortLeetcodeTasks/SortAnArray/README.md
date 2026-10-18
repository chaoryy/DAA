# 1. Sort an Array

## 1. Problem
The task is to sort an unsorted array of integers in ascending order.

## 2. Approach
I implemented a simple comparison-based sorting algorithm (a variation of Bubble Sort).

* The algorithm uses two nested `for` loops.
* The inner loop iterates through the array starting from index `1`, comparing each element with the previous one (`nums[i]` and `nums[i-1]`).
* If an element is smaller than the previous one (`nums[i] < nums[i-1]`), they are swapped using a temporary variable `tmp`.
* The outer loop repeats this process to ensure all elements move into their correct sorted positions.

### Step-by-Step Tracing Example
Given `nums = [3, 1, 2]`:
* **Outer loop `j = 1`:**
    * `i = 1`: Compare `nums[1]` (1) and `nums[0]` (3). Since `1 < 3`, swap them $\rightarrow$ array becomes `[1, 3, 2]`.
    * `i = 2`: Compare `nums[2]` (2) and `nums[1]` (3). Since `2 < 3`, swap them $\rightarrow$ array becomes `[1, 2, 3]`.
* **Outer loop `j = 2`:**
    * Additional iterations verify that elements are now in order.
* **Result:** `[1, 2, 3]`

### Challenges Faced
The main challenge with this approach is its lack of efficiency. While the code is straightforward to write, running two nested loops over the whole array results in redundant passes even after the array is already sorted.

---

## 3. Complexity Analysis

* **Time Complexity:** $O(n^2)$
    * **Explanation:** There are two nested loops, each executing up to $n$ times (where $n$ is the length of `nums`). In the worst and average cases, the inner loop performs approximately $n^2$ comparisons and swaps.

* **Space Complexity:** $O(1)$
    * **Explanation:** The sorting is performed in-place. The algorithm only uses a single auxiliary variable (`tmp`) regardless of input size.

---

## 4. Reflection / Improvement

* **Is there a more efficient approach?**
  Yes. This $O(n^2)$ solution will result in a **Time Limit Exceeded (TLE)** error on LeetCode due to the large test cases ($n \le 50,000$).

* **What would need to be changed?**
  Replace the quadratic sorting approach with an $O(n \log n)$ algorithm, such as **Merge Sort**, **Quick Sort**, or **Heap Sort**.

* **What complexity could the improved solution achieve?**
    * **Time Complexity:** $O(n \log n)$
    * **Space Complexity:** $O(n)$ with Merge Sort, or $O(\log n)$ with Quick Sort / Heap Sort.