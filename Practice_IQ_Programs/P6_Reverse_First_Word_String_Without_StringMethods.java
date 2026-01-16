package Coding_Preparation_.Practice_IQ_Programs;

public class P6_Reverse_First_Word_String_Without_StringMethods {
    public static void main(String[] args) {

        String str = "Mahi Attend Interview";
        String[] words = str.split(" ");
        String rev = " ";

        String first_word = words[0];

        for (int i = first_word.length() - 1; i >= 0; i--) {
            rev = rev + first_word.charAt(i);
        }
        System.out.print(rev + " ");

        for (int i = 1; i <words.length ; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
