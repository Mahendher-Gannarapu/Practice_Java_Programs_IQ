//Given String is "Mahi123@" print separate chars, letters, numbers?
package Coding_Preparation_.Practice_IQ_Programs;

public class P11_Separate_Chars_Letters_SpecialChar_FromString {
    public static void main(String[] args) {
        String str = "Mahi123@#$";

        String numbers = str.replaceAll("[^0-9]","");
        String letters = str.replaceAll("[^a-zA-Z]","");
        String specialchar = str.replaceAll("[a-zA-Z0-9]","");
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(specialchar);

    }
}


/* public class SeparateCharacters {
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

*/