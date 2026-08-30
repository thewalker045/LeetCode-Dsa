class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                count++;
                continue;
            }

            if (i == 0 || nums[i] != nums[i - 1]) {
                int x = i;

                while (x < nums.length && nums[x] == nums[i]) {
                    x++;
                }

                if (x - i == map.get(nums[i])) {
                    count++;
                }

                i = x - 1;
            }
        }

        return count;
    }
}