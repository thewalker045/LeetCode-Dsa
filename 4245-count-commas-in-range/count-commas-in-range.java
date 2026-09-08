class Solution {
    public int countCommas(int n) {
        String s=String.valueOf(n);
        int count=0;

        if(s.length()>=4){
            count=n-1000+1;
        }
        return count;
    }
}