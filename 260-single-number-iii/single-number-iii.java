class Solution {
    public int[] singleNumber(int[] nums) {

            Arrays.sort(nums);
            int ans[]=new int[2];
            int x=0;
            for(int i=0;i<nums.length;i++){
                if(i==nums.length-1){ans[x++]=nums[i];break;}
                if(nums[i]==nums[i+1])i++;
                else if(nums[i]!=nums[i+1])ans[x++]=nums[i];
            }

            return ans;

    }
}