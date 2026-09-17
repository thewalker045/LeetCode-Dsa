class Solution {
    public String defangIPaddr(String address) {
        String newString="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)==46){
                newString+="[.]";
                continue;
            }
            newString+=address.charAt(i);
        }
        return newString;
    }
}