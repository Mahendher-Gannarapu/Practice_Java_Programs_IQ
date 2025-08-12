package Coding_Preparation_.Practice_IQ_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

//Write a program to print all the unique characters in a String.
// For instance, if the input string is “abcb”, the output will be the characters ‘a’ and ‘c’ as they are unique.
// The character ‘b’ repeats twice and so it will not be printed.
public class SoulaxIQ2 {
    public static void main(String[] args) {

        String str = "abcb";
        Map<Character , Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character , Integer> entry : map.entrySet()) {
            if (entry.getValue() <= 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
