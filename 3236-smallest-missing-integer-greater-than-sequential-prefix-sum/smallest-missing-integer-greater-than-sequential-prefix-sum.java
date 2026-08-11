class Solution {

    public int linearSearch(int nums[], int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k)
                return i;
        }
        return -1;
    }

    public int missingInteger(int[] nums) {

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1)
                sum += nums[i];
            else
                break;
        }

        if (linearSearch(nums, sum) == -1)
            return sum;

        
        while (linearSearch(nums, sum) != -1) {
            sum++;
        }

        return sum;
    }
}