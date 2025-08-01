//Finding common elements in two arrays
//String[] arr1={"one","two","five","nine","eight"};
//String[] arr2={"one","four","five","eight","ten"};
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class P26_Common_elements_in_Two_arrays {
    public static void main(String[] args) {

        String[] arr1={"one","two","five","nine","eight"};
        String[] arr2={"one","four","five","eight","ten"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));

        list1.retainAll(list2);

        System.out.println("Common elements: " + list1);
    }
}
