class Solution {

    public int findSumAndproduct(int n,int flag){
        int sum=0;
        int product=1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        System.out.println(sum +" "+ product);

        if(flag==-1)return sum;
        return product;
    }
    public boolean checkDivisibility(int n) {
        int factor=findSumAndproduct(n,-1)+findSumAndproduct(n,1);

        if(n%factor==0)return true;
        return false;
    }
}