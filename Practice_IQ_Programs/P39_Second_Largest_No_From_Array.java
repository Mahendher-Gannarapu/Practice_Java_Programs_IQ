package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Arrays;

public class P39_Second_Largest_No_From_Array {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 2, 9, 4};

        Arrays.sort(arr); // ascending
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Largest number: " + arr[arr.length - 2]);
    }

}
