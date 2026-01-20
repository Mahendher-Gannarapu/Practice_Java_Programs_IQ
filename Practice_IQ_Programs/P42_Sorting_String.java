//Sorting the String
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Arrays;

public class P42_Sorting_String {
    public static void main(String[] args) {

        String str = "mahendher";

        char[] chars = str.toCharArray();
        System.out.println("Before Sorting String: "+str);
//        Arrays.sort(chars);
//        System.out.println(Arrays.toString(chars));

        for(int i=0;i<chars.length-1;i++)
        {
            for(int j=0;j<chars.length-i-1;j++)
            {
                if(chars[j]>chars[j+1])
                {
                    char temp=chars[j];
                    chars[j]=chars[j+1];
                    chars[j+1]=temp;
                }
            }
        }

        String sortedStr = new  String(chars);
        System.out.println("After Sorting String: "+sortedStr);
    }
}
