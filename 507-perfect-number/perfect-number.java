class Solution {
    public boolean checkPerfectNumber(int num) {
        List<Integer> list=new ArrayList<>();
        if(num==1)return false;
        list.add(1);
        for(int i=2;i<=num/2;i++){
            if(num%i==0)list.add(i);
        }

        int sum=0;
        for(int nums:list)sum+=nums;

        if(sum==num)return true;
        return false;
    }
}