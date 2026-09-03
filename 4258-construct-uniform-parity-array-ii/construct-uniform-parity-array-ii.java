class Solution {
    public boolean oddCase(int[] nums1,int minOdd){
        boolean flag=true;
            for(int it:nums1){
                if(it%2==0){
                    if(minOdd>=it)flag=false;
                }
            }
            return flag;
    }
     public boolean evenCase(int[] nums1,int minOdd){
        boolean flag=true;
            for(int it:nums1){
                if(it%2!=0){
                    if(minOdd>=it)flag=false;
                }
            }
            return flag;
    }
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        for(int num:nums1){
            if(num%2!=0){
                if(minOdd>num)minOdd=num;
            }
        }
        

        boolean flag1=oddCase(nums1,minOdd);
        boolean flag2=evenCase(nums1,minOdd);

        return flag1 || flag2;

       
    }
}