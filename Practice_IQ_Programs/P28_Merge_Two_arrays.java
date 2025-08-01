//Write a program to merge two array lists [a,b,c] [1,2,3].
// Output should be [a,1,b,2,c,3].
// Result arraylist should be of size 6.
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class P28_Merge_Two_arrays {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "3"));

        // Result list
        ArrayList<String> mergedList = new ArrayList<>();

        // Merge alternately
        for (int i = 0; i < list1.size(); i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        // Output
        System.out.println(mergedList);
    }
    }

