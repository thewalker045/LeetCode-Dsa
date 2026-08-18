class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        int ans = -1;

        if (k == 1) {
            for (int num : nums) {
                if (map.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        if (k == n) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }

        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (map.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}