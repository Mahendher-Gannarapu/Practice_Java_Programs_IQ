package Coding_Preparation_.Practice_IQ_Programs;

public class P8_Reverse_Mid_Word_String_Without_StringMethods {
    public static void main(String[] args) {

        String str = "Java Automation Testing Framework";
        String[] words = str.split(" ");
        String rev = "";

        String mid_word = words[1];

        for (int i = mid_word.length() - 1; i >= 0; i--) {
            rev = rev + mid_word.charAt(i);
        }
        // System.out.print(rev + " ");

        for (int i = 0; i < words.length ; i++) {
            if(i==1)
            {
                System.out.print(rev + " ");
            }else
            {
                System.out.print(words[i] + " ");
            }
        }
    }
}
