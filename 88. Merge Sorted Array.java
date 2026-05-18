class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last valid element in nums1
        int i = m - 1;

        // Pointer for last element in nums2
        int j = n - 1;

        // Pointer for last index of nums1
        int k = m + n - 1;

        // Compare elements from back
        while(i >= 0 && j >= 0) {

            // If nums1 element is larger
            if(nums1[i] < nums2[j]) {

                // Place nums1 element at kth position
                nums1[k] = nums2[j];

                // Move nums1 pointer left
                j--;
            }
            else {

                // Place nums2 element at kth position
                nums1[k] = nums1[i];

                // Move nums2 pointer left
                i--;
            }

            // Move final position pointer left
            k--;
        }

        // Copy remaining nums2 elements if any
        while(j >= 0) {

            nums1[k] = nums2[j];

            j--;
            k--;
        }
    }
}
