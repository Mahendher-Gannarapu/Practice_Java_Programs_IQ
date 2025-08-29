// Example: input could be "5 test 200 hello 999 done"
package Coding_Preparation_.Practice_IQ_Programs;

public class P33_PrintNumbersOnlyExceptFirstNumber_Perficient {
    public static void main(String[] args) {

        String input = "1 of 30 and print 315 google";
        String[] words = input.split(" ");
        int count = 0;

        for (String word : words) {
            // Check if word is a number
            if (word.matches("\\d+")) {
                count++;
                if (count > 1) { // Skip the first number
                    System.out.println(word);
                }
            }
        }
    }
}
