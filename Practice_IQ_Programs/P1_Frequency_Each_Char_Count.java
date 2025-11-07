//Frequency of each char from the given String?
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.HashMap;
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
//        for(Map.Entry<Character,Integer> entry: fre.entrySet())
//        {
//            System.out.println(entry.getKey()+"->"+entry.getValue());
//        }

        //output is M->1
        //a->4
        //h->2
        //e->2
        //n->3
        //d->1
        //r->2
        // ->1
        //G->1
        //p->1
        //u->1
        // it will print without space
        for(Map.Entry<Character,Integer> entry: fre.entrySet()) {
            if (entry.getValue() >=1 && entry.getKey() != ' ') {
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }

        //Cap Gemini interview question on 08-10-2025
        //I want to print in non repeating char of first letter.
        // Example input is "ahendherannarapu"; here non repeat charcters "dpu".
        // I what to print "d" only

        // Find and print the first non-repeating character
//        for (Map.Entry<Character, Integer> entry : fre.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println("First non-repeating character: " + entry.getKey());
//                break; // Stop after finding the first one
//            }
//        }
    }
}

//Without using collections
public class CharFrequency {
    public static void main(String[] args) {
        String str = "KKAAIBF";
        int[] freq = new int[str.length()];
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;  // Initialize frequency
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark as visited
                }
            }
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (chars[i] != '0') {
                System.out.println(chars[i] + " → " + freq[i]);
            }
        }
    }
}
