//Missing element from the array
package Coding_Preparation_.Practice_IQ_Programs;

public class P37_Missing_number_From_Array {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 12};

        // Sort in ascending order (for finding missing element)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // Changed to > for ascending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find missing element
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 2) {
                System.out.println("Missing element: " + (arr[i] + 2));
                break;
            }
        }
    }
}
