package Coding_Preparation_.Practice_IQ_Programs;

public class P11_Separate_ChLeSpeCh_Without_StringMethods {
    public static void main(String[] args) {

        String str = "Mahi123@#$";
        String letters = "";
        String digits = "";
        String specials = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            } else {
                specials += ch;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Specials: " + specials);
    }
}
