//Java program that takes the input string "Ravi Teja Bompally" and
// prints the output as R.T.Bompally:
package Coding_Preparation_.Practice_IQ_Programs;

public class P24_Print_FirstLetters_2_words_LastWordSame {
    public static void main(String[] args) {

        String input = "Ravi Teja Bompally";
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (String word : words) {
            count++;
            if (count < words.length) {
                result.append(word.charAt(0)).append(".");
            } else {
                result.append(word); // Last word (surname)
            }
        }

        // Output: R.T.Bompally
        System.out.println(result.toString());
    }
}
