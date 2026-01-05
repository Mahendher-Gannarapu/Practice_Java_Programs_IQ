package Coding_Preparation_.Practice_IQ_Programs;

public class P48_Unique_Triple_With_Zero {
    public static void main(String[] args) {

        int[] arr= {-1,0,2,1,-2,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
}
