package Coding_Preparation_.Practice_IQ_Programs;
//Write a program in Java to Toggle the case of every character of a string.
// For instance, if the input string is “ApPLe”, the output should be “aPplE”.
// The special character and numerals should remain the same.
public class SoulaxIQ1 {
    public static void main(String[] args) {

        String input = "ApPLe";

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                result.append(Character.toUpperCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());

    }
}
