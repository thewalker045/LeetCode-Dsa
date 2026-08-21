class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int combo1=nums[0]*nums[1]*nums[nums.length-1];
        int combo2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int max=Math.max(combo1,combo2);

        return max;
    }
}