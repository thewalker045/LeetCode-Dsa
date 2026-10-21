
class Solution {
    public int minDeletions(int[] nums) {
      int n=nums.length;
      int i=0;
      int count=0;

      while(i<n-1){
        if(nums[i]==nums[i+1]){
            count++;
        }
        i++;
      }
      return count;
    }
}
