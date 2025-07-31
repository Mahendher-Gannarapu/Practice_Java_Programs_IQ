//Print First letters of the "Mahi Ganna" print M G?
package Coding_Preparation_.Practice_IQ_Programs;

public class P15_Print_First_Letters_FromString {
    public static void main(String[] args) {

        String str ="Mahi Ganna";
        String[] words = str.split(" ");
        for(String word : words)
        {
            System.out.print(word.charAt(0) + " ");
        }
    }
}
