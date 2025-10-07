//Sum of Numbers from the String. Ex: String input = "1 of 30 and print 315 google"
// Sum of 1+ 30 +315
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P40_SumOfNumbers_From_String {
    public static void main(String[] args) {
        String input = "1 of 30 and print 315 google";
        int sum = 0;

        Pattern pattern = Pattern.compile("\\d+"); // Match one or more digits
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        System.out.println("Sum of all numbers in string: " + sum);

    }
}
