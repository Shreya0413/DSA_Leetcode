class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Traverse array
        for(int i = 0; i < nums.length; i++) {

            // Check elements after i
            for(int j = i + 1; j < nums.length; j++) {

                // If sum equals target
                if(nums[i] + nums[j] == target) {

                    // Return indices
                    return new int[] {i, j};
                }
            }
        }

        // No solution case
        return new int[] {};
    }
}
