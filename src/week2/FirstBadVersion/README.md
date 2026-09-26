1) Given n versions and an API method isBadVersion(version), that returns boolean. I need to find the first bad version making as few api calls as possible
2) I created two int left = 1 and right = n. They are showing what part of array we are working with. Then i calculated mid number by using left + (right - left) / 2 to prevent overflow. Then check isBadVersion(version), 
   - if true - mid is a bad version, so we need to check previous versions. We change right to right = mid
   - if false - mid is not a bad version, so we need to check next versions. We change left to left = mid + a
3) O(log n) - n/2 then n/2^2 (n/2/2), then n/2^3 (n/2/2/2)
4) O(1) we use only three integers
5) - O(log n) is the optimal time complexity for finding an item
   - Nothing
   - Solution already achives optimal complexity