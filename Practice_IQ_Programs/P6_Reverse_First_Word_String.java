//Reverse the first word from the String?
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
