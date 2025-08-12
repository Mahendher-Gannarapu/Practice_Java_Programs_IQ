package Coding_Preparation_.Practice_IQ_Programs;
//input array {1,4,5,6,7} output print 0th and 2nd index

public class P32_Finding_Index_From_Array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7};
        int[] targetNumbers = {1, 5}; // numbers we want to find

        for (int target : targetNumbers) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.println("Element " + target + " found at index: " + i);
                }
            }
        }
    }
}
