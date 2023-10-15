# PROBLEM

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

# EXPLANATION

1. The code begins by sorting the array nums in non-decreasing order using the sort function from the C++ Standard Library. This rearranges the elements such that identical elements are grouped together.

2. Once the array is sorted, the majority element will always be present at index n/2, where n is the size of the array.
This is because the majority element occurs more than n/2 times, and when the array is sorted, it will occupy the middle position.

3. The code returns the element at index n/2 as the majority element.