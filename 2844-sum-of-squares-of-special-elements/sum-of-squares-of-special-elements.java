class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;

        int i=1;

        for(int num:nums) {
            if(nums.length%i==0) sum+=num*num;
            i++;
        }
        

        return sum;
    }
}