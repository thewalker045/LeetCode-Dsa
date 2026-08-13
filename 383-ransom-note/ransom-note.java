class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mapRansom=new HashMap<>();
        HashMap<Character,Integer> mapMagazine=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            mapRansom.put(ransomNote.charAt(i),mapRansom.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            mapMagazine.put(magazine.charAt(i),mapMagazine.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(Character x:mapRansom.keySet()){
            if(mapMagazine.get(x)!=null && (mapRansom.get(x)<=mapMagazine.get(x)))continue;
            else{
                return false;
            }
        }

        return true;
        



    }
}