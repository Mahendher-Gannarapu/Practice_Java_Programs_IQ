//Create a hash map with the below structure
//{ 'A' : 5, 'G' : {'E' : 10, 'B' : 20}, 'F' : 100, 'S' : 90 }
// (Note G contains hashmap as its value)
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class P27_HashMap_With_Stracture {
    public static void main(String[] args) {

        Map<String, Integer> inner_map = new HashMap<>();
        inner_map.put("E",10);
        inner_map.put("B",20);

        System.out.println(inner_map);

        Map<String, Object> outerMap = new LinkedHashMap<>();
        outerMap.put("A", 5);
        outerMap.put("G", inner_map); // nested map
        outerMap.put("F", 100);
        outerMap.put("S", 90);

        System.out.println(outerMap);

    }
}
