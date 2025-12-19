//Reverse the middle word from the String?
package Coding_Preparation_.Practice_IQ_Programs;

public class P8_Reverse_Mid_Word_String {
    public static void main(String[] args) {
        String str = "Mahendher attend interview";
        String[] words = str.split(" ");
        if (words.length >=3) {
            int mid = words.length / 2;
         words[mid] = new StringBuilder(words[mid]).reverse().toString();
        }
        System.out.println(String.join(" ",words));
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

        String firstword = words[1];

        for (int i = firstword.length() - 1; i >= 0; i--) {
            rev = rev + firstword.charAt(i);
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
*/