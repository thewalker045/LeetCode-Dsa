class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        

        for(int num:arr)map.put(num,map.getOrDefault(num,0)+1);

            for(int num:map.keySet()){
                map1.put(map.get(num),map1.getOrDefault(map.get(num),0)+1);
            }

            for(int num:map1.keySet()){
                if(map1.get(num)>1)return false;
            }
        return true;

    }
}