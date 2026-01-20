//Sum of Numbers from the String. Ex: String input = "1 of 30 and print 315 google"
// Sum of 1+ 30 +315
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P40_SumOfNumbers_From_String {
    public static void main(String[] args) {
        String input = "1 of 30Hi40 and print 315 google";
        int sum = 0;

        Pattern pattern = Pattern.compile("\\d+"); // Match one or more digits
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        System.out.println("Sum of all numbers in string: " + sum);

    }
}
/*

Program Explanation:
1. Input String:
java
String input = "1 of 30Hi40 and print 315 google";
The string contains:

"1" - standalone number

"30Hi40" - contains numbers within text

"315" - standalone number

2. Regular Expression Pattern:
java
Pattern pattern = Pattern.compile("\\d+");
Pattern.compile() - Creates a pattern object for regex matching

"\\d+" - The regular expression pattern:

\\d - Matches any digit (0-9)

+ - Means "one or more" occurrences

So "\\d+" matches one or more consecutive digits

3. Matcher Object:
java
Matcher matcher = pattern.matcher(input);
Creates a matcher that will search the input string for the pattern

The matcher can find multiple matches in the string

4. Finding Matches:
java
while (matcher.find()) {
    sum += Integer.parseInt(matcher.group());
}
matcher.find() - Searches for the next occurrence of the pattern

Each time it finds a match:

matcher.group() - Returns the matched substring

Integer.parseInt() - Converts the string to an integer

Adds to the running sum

5. What It Matches:
For input "1 of 30Hi40 and print 315 google", it finds:

"1" → adds 1 to sum

"30" (from "30Hi40") → adds 30 to sum

"40" (from "30Hi40") → adds 40 to sum

"315" → adds 315 to sum

Total sum = 1 + 30 + 40 + 315 = 386
 */
