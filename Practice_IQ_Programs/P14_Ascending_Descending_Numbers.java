//Ascending order and Descending order for numbers?
package Coding_Preparation_.Practice_IQ_Programs;

public class P14_Ascending_Descending_Numbers {
    public static void main(String[] args) {

        int[] arr = {3,4,5,2,1};

        //Ascending order
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("ascending order");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }

// descending order
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("\nDescending order");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
