import java.util.Arrays;
public class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Get the lengths of input arrays nums1 and nums2
        int a = nums1.length;
        int b = nums2.length;
    
        // Calculate the total length of the merged array
        int c = a + b;
    
        // Create a new integer array to hold the merged elements
        int[] arr = new int[c];
    
        // Copy elements from nums1 into arr
        for (int i = 0; i < a; i++) {
            arr[i] = nums1[i];
        }
    
        // Copy elements from nums2 into arr, starting from position a
        for (int i = 0; i < b; i++) {
            arr[a + i] = nums2[i];
        }
    
        // Sort the merged array in ascending order
        Arrays.sort(arr);
    
        // Check if the length of the merged array is even or odd
        if (c % 2 == 0) {
            // Calculate the indices of the two middle elements
            int mid1 = (c - 1) / 2;
            int mid2 = mid1 + 1;
    
            // Calculate the median as the average of the two middle elements
            return (double) (arr[mid1] + arr[mid2]) / 2;
        } else {
            // Calculate the index of the middle element
            int mid = (c - 1) / 2;
    
            // Return the middle element as the median
            return arr[mid];
        }
    }
}