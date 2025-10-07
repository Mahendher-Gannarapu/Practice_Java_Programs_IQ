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
    }
}
