package Coding_Preparation_.Practice_IQ_Programs;

import java.util.LinkedHashMap;

import java.util.*;
public class P1_Frequency_Each_Char_Count_Method1 {

            public static void main(String[] args) {

            String input = "Mahendher Gannarapu";

            // Step 1: Convert string to a char array (data collection)
            char[] chars = input.toCharArray();

            // Step 2: Create LinkedHashMap (to maintain order)
            Map<Character, Integer> freqMap = new LinkedHashMap<>();

            // Step 3: Compare and count
            for (char ch : chars) {
                // Ignore spaces if needed
                if (ch == ' ') continue;

                Integer count = freqMap.get(ch); // get existing count
                if (count == null) {
                    freqMap.put(ch, 1);
                } else {
                    freqMap.put(ch, count + 1);
                }
            }

            // Step 4: Print result
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

}
