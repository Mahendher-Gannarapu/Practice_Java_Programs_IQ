//Frequency of each number from the given array?
package Coding_Preparation_.Practice_IQ_Programs;
import java.util.Map;
import java.util.HashMap;
public class P2_Frequency_Each_Number_Count {
    public static void main(String[] args) {

        Integer[] input = {1,2,3,3,4,5,6,4,5};
        Map<Integer,Integer> fre = new HashMap<>();

        for(Integer num : input)
        {
            if(fre.containsKey(num))
            {
                fre.put(num,fre.get(num)+1);
            }
            else
            {
                fre.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: fre.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
