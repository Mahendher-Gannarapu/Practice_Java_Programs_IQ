package Coding_Preparation_;

import java.util.HashMap;
import java.util.Map;

//Find the Frequency of Each Element in an Array ( Hashmap)**
//Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
//O/p 2→ 3 , 3 → 2 , 4→ 2, 5→ 3
public class FindFrequencyOfEachElement_HashMap {
    public static void main(String[] args) {
        Integer[] numbers ={2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(Integer num: numbers)
        {
            if(freqMap.containsKey(num))
            {
                freqMap.put(num,freqMap.get(num)+1);
            } else {
                freqMap.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet())
        {
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }
    }
}
