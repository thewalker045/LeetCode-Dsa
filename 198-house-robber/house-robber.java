class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        int take,not_take;

        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){

                take=nums[i];
                if(i>1) take+=dp[i-2];
                not_take=dp[i-1];

                dp[i]=Math.max(take,not_take);

        }

        return dp[nums.length-1];


    }
}