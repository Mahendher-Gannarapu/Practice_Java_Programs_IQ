package Coding_Preparation_.Practice_IQ_Programs;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

public class P43_Frequency_of_String {

        public static void findCharFrequency(String str) {
            // 1. Create a HashMap to store characters and their counts
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Convert the string to a character array
            char[] strArray = str.toCharArray();

            // 2. Iterate through the character array
            for (char c : strArray) {
                // Optional: Skip spaces or convert to lowercase if required
                if (c == ' ') {
                    continue;
                }

                // 3. Check if the character is already a key in the Map
                if (charCountMap.containsKey(c)) {
                    // If present, increment its count
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    // If not present, add it with a count of 1
                    charCountMap.put(c, 1);
                }
            }

            // 4. Print the result
            System.out.println("Input String: \"" + str + "\"");
            System.out.println("Character Frequencies: " + charCountMap);
        }

        // Main method to test the function
        public static void main(String[] args) {
            String input = "programming";
            findCharFrequency(input);

            String input2 = "hello world";
            findCharFrequency(input2);
        }
    }

