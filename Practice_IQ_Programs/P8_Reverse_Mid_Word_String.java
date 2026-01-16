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

