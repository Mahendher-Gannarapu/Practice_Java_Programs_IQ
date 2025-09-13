package Coding_Preparation_.Practice_IQ_Programs;

public class P38_Find_Max_Min_From_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,6,8,9,4,3};
        int max = arr[0] , min =arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
