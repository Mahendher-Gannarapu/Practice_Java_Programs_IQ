package Coding_Preparation_;

import java.util.HashMap;
import java.util.Map;

public class Infosys_Asked_Freq_Chars_Count {
    public static void main(String[] args) {
            {
                String input = "THis is infosys. Infosys has Selenium Automation and API Automation";

                Map<Character, Integer> freq= new HashMap<>();

                for(char ch: input.toCharArray())
                {
                    if(freq.containsKey(ch))
                    {
                        freq.put(ch,freq.get(ch)+1);
                    }
                    else
                    {
                        freq.put(ch,1);
                    }
                }

                for(Map.Entry<Character, Integer> entry : freq.entrySet())
                {
                    System.out.println(entry.getKey() +" -> " +entry.getValue());
                }
            }

        }
}
