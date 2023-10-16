### `searchRange` Function Explanation

1. Get the length of the input array `nums`.
2. Initialize an array to store the search range.
3. Initialize an array with [-1, -1] (default return value).
4. Initialize the start index of the search range as -1.
5. Initialize the end index of the search range as -1.
6. Start iterating through the input array.
7. If the current element is not the target, continue to the next element.
8. If the current element is not the target, continue to the next iteration.
9. If the start index of the search range is -1, set it to the current index.
10. Update the end index of the search range to the current index when a match is found.
11. If the start index is not -1, return the search range.
12. Return the search range containing the start and end indices of the target.
13. If no match was found, return the default [-1, -1] array.
14. Return the default search range [-1, -1] to indicate no match.