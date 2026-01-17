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


