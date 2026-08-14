class Solution {
    public int maximumLengthSubstring(String s) {
        if(s.equals("")) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int max=1;
        int i=0;
        for(int j=0;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                while(map.get(s.charAt(j))>2){
                   map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                   i++;
                }
                max=Math.max(max,j-i+1);

        }

        return max;
    }
}