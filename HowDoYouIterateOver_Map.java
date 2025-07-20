package Coding_Preparation_;

import java.util.HashMap;
import java.util.Map;

public class HowDoYouIterateOver_Map {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",3);
        map.put("Bannana",2);
        map.put("Orange",8);

        //Iterating using entrySet
        for(Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println("Key: " +entry.getKey()+ ", Value: " +entry.getValue());
        }
    }
}
