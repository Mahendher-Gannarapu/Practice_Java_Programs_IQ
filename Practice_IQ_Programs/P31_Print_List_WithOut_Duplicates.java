package Coding_Preparation_.Practice_IQ_Programs;

import java.util.*;

//String[] arr1={"one","two","five","nine","eight"};
//String[] arr2={"one","four","five","eight","ten"};
// I want to print list with out duplicates
public class P31_Print_List_WithOut_Duplicates {
    public static void main(String[] args) {
        String[] arr1 = {"one", "two", "five", "nine", "eight"};
        String[] arr2 = {"one", "four", "five", "eight", "ten"};

        // Use Set to remove duplicates
        Set<String> mergedSet = new LinkedHashSet<>(); // keeps insertion order
        mergedSet.addAll(Arrays.asList(arr1));
        mergedSet.addAll(Arrays.asList(arr2));

        // Convert back to List if needed
        List<String> mergedList = new ArrayList<>(mergedSet);

        // Print merged list
        System.out.println("Merged list without duplicates: " + mergedList);
    }
}
