class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int Maxlength = Integer.MIN_VALUE;
        int length=1;
        for (int i = 0; i < nums.length - 1; i++) {
           if(nums[i]<nums[i+1]){
            length++;
           }
           else{
                Maxlength=Math.max(Maxlength,length);
                length=1;
           }
        }
        Maxlength=Math.max(Maxlength,length);
        return Maxlength;
    }
}