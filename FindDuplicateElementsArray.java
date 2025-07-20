package Coding_Preparation_;
//Find Duplicate elements in Array
public class FindDuplicateElementsArray {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 4, 9, 5};
        System.out.println("Duplicate elements are:");
        for(int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    }
