//solve the problem of printing the middle non-repeating character in a given string like:
//String input = "switchas switches que testing";
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P23_Middle_NonRepeating_Char {
    public static void main(String[] args) {

        String input = "switchas switches que testing";

        // Remove spaces
        input = input.replaceAll(" ", "");

        // Use LinkedHashMap to preserve insertion order
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Collect non-repeating characters
        List<Character> nonRepeats = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeats.add(entry.getKey());
            }
        }

        if (nonRepeats.size() > 0) {
            int middleIndex = nonRepeats.size() / 2;
            System.out.println("Middle non-repeating character: " + nonRepeats.get(middleIndex));
        } else {
            System.out.println("No non-repeating character found.");
        }

    }
}
