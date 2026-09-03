class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String natural1 = "";
        String imaginary1 = "";
        String natural2 = "";
        String imaginary2 = "";

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == 43) {
                natural1 = num1.substring(0, i);

                imaginary1 = num1.substring(i + 1, num1.length() - 1);

            }
        }
        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) == 43) {
                natural2 = num2.substring(0, i);

                imaginary2 = num2.substring(i + 1, num2.length() - 1);

            }
        }
        System.out.println(natural1 + " " + imaginary1 + " " + natural2 + " " + imaginary2);

        String natural =String.valueOf((Integer.parseInt(natural1)*Integer.parseInt(natural2))-(Integer.parseInt(imaginary1)*Integer.parseInt(imaginary2)));
        String imaginary =String.valueOf((Integer.parseInt(natural1)*Integer.parseInt(imaginary2))+(Integer.parseInt(natural2)*Integer.parseInt(imaginary1)));
        System.out.println(natural+" "+imaginary);

        return natural+"+"+imaginary+"i"; 
        

    }
}