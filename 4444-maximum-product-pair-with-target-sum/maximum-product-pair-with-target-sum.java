class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int maxProduct = Integer.MIN_VALUE;
        int[] ans = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && nums[i] + nums[j] == target) {
                    if (maxProduct < nums[i] * nums[j]) {
                        maxProduct = nums[i] * nums[j];
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }

        return ans;
    }
}