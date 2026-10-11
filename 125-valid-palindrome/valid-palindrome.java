class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
       for(int i=0;i<s.length();i++){
        if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
    (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
       { sb.append(s.charAt(i));}}
       System.out.println(sb.toString()+" "+sb.reverse().toString());

       return sb.toString().equals(sb.reverse().toString());
    }
}