//Reverse the first word from the String?   String str = "Mahendher attend interview";
package Coding_Preparation_.Practice_IQ_Programs;

public class P6_Reverse_First_Word_String {
    public static void main(String[] args) {

        String str = "Mahendher attend interview";
        String[] words = str.split(" ",2);

        String first_word = new StringBuilder(words[0]).reverse().toString();
        String result = first_word + " " + (words.length>1 ?words[1]:"");
        System.out.println(result);

    }
}

/*
import java.util.LinkedHashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
         String str = "Java Automation Testing Framework";
        String[] words = str.split(" ");
        String rev = "";

        String firstword = words[0];

        for (int i = firstword.length() - 1; i >= 0; i--) {
            rev = rev + firstword.charAt(i);
        }
        System.out.print(rev + " ");

        for (int i = 1; i < words.length ; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
 */