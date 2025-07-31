//Find duplicates from the String?
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class P3_Duplicates_From_String {
        public static void main(String[] args)
        {
            String input = "Mahendher Gannarapu";

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
                if(entry.getValue()>1) {
                    System.out.println(entry.getKey());
                }
            }
        }
}
