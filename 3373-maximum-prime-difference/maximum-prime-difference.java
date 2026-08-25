class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int res=0,idx=-1;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                if(idx==-1) idx=i;
                else res=i-idx;
            }
        }
        return res;
    }

    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}