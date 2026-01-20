package Coding_Preparation_.Practice_IQ_Programs_Repeated;

public class P6_Array_Reverse {
    public static void main(String[] args)
    {
        int[] arr = {111,2,33,1,2980,5};
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            System.out.println(arr[i]+" ");
//        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
