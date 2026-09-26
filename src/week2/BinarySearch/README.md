1) You have to write function for binary search. Array and target are given.
2) My solution use Array biult-in method for binary search. It returns negative number if target is not in the array, so i used ternary operator, that checks if index is more or equals 0, if it is method returns index, if not it returns -1;
3) O (log n) Binary search divides the search space in half each time, making it very fast.
4) O (1) We dont create new big objects
5) - O (log n) is alredy best speed for searching in a sorted array.
   - Instead of using built-in method, i could write binary search logic by myself
   - The time and space complexity would remain the same 