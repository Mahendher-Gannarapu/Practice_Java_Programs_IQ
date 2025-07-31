//Reverse the last word from the String?
package Coding_Preparation_.Practice_IQ_Programs;

public class P7_Reverse_Last_Word_String {
    public static void main(String[] args) {
        String str = "Mahendher attend interview";
        String[] words = str.split(" ");

        if(words.length>0)
        {
        words[words.length-1]= new StringBuilder(words[words.length-1]).reverse().toString();
    }
        System.out.println(String.join(" ", words));
}
}
