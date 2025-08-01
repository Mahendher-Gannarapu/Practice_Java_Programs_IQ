//How to reverse an array in the subset of N? e.g.
// Input: [111,113,115,227,229,237,515,517,519],
// Output: [115,113,111,237,229,227,519,517,515].
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Arrays;

public class P21_Reverse_Array_Subset_N {
    public static void main(String[] args) {

        int[] arr = {111, 113, 115, 227, 229, 237, 515, 517, 519};
        int n=3;

        for(int i=0;i<arr.length;i+=n)
        {
            int left =i;
            int right = Math.min(i+n-1, arr.length - 1);

            // Reverse the subarray
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
        }
    }

