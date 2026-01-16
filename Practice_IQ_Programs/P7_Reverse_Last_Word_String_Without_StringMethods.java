package Coding_Preparation_.Practice_IQ_Programs;

public class P7_Reverse_Last_Word_String_Without_StringMethods {
    public static void main(String[] args) {
        String str = "Java Automation Testing Framework";
        String[] words = str.split(" ");
        String rev = "";

        // Get the last word
        String lastWord = words[words.length - 1];

        // Reverse the last word manually
        for (int i = lastWord.length() - 1; i >= 0; i--) {
            rev = rev + lastWord.charAt(i);
        }

        // Print all words except the last one
        for (int i = 0; i < words.length - 1; i++) {
            System.out.print(words[i] + " ");
        }

        // Print the reversed last word
        System.out.print(rev);
    }
}
