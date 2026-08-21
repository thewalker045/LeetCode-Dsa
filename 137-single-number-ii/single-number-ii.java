class Solution {
    public int singleNumber(int[]nums) {
        HashMap<Integer,Integer> list=new HashMap<>();

        for(int num:nums){
            list.put(num,list.getOrDefault(num,0)+1);
        }

        for(int num:list.keySet()){
            if(list.get(num)==1) return num;
        }

        return -1;
    }
}