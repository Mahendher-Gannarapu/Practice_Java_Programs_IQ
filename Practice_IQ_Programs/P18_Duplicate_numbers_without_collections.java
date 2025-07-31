//Find duplicate elements from the array without using collections?
package Coding_Preparation_.Practice_IQ_Programs;

public class P18_Duplicate_numbers_without_collections {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 5};

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Check if elements are equal
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // After finding duplicate, break inner loop
                }
            }
        }

    }
}
