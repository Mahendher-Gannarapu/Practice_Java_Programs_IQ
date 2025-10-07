//Take two lists {"apple", "orange", "Mango"} and {"apple", "Mango", "Kiwi"}
// find out duplicates from the list?
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class P13_Duplicate_item_From_List {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("orange");
        list1.add("Mango");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("Mango");
        list2.add("Kiwi");

        Set<String> merge = new HashSet(list1);
        Set<String> merge1 = new HashSet(list2);

        merge.retainAll(merge1);
        //merge.addAll(merge1);

        System.out.println(merge);
    }
}
