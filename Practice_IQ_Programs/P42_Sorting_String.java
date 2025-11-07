package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Arrays;

public class P42_Sorting_String {
    public static void main(String[] args) {

        String str = "mahendher";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
    }
}
