class Solution {
    public String RotateString(String s){
        return s.substring(1,s.length())+String.valueOf(s.charAt(0));
    }
    public int countRotations(String s, int k) {
        int count=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            System.out.println(s);
            score=0;
            
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)==s.charAt(j+1)) {
                     System.out.println(score);
                     score++;
                }
            }
            if(score==k)count++;
            s=RotateString(s);

        }
        return count;
    }
}