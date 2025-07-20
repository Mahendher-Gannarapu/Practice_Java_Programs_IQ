package Coding_Preparation_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringFrequencyEx {

    public static void main(String[] args) {
       String input = "Mahendher";

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
