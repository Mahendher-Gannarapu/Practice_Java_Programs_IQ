//Frequency of each char from the given String?
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class P1_Frequency_Each_Char_Count {
    public static void main(String[] args) {

        String input = "Mahendher Gannarapu";
        //LinkedHashMap is used because it maintains the order of insertion.
        Map<Character,Integer> fre = new LinkedHashMap<>();
        for(char ch : input.toCharArray())
        {
            if(fre.containsKey(ch))
            {
                fre.put(ch,fre.get(ch)+1);
            }
            else
            {
                fre.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: fre.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        //Cap Gemini interview question on 08-10-2025
        //I want to print in non repeating char of first letter.
        // Example input is "ahendherannarapu"; here non repeat charcters "dpu".
        // I what to print "d" only

        // Find and print the first non-repeating character
        for (Map.Entry<Character, Integer> entry : fre.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break; // Stop after finding the first one
            }
        }
    }
}
