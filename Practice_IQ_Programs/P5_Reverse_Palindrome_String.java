//Reverse the string and palindrome or not?
package Coding_Preparation_.Practice_IQ_Programs;
import java.util.Scanner;
public class P5_Reverse_Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        //String reverse="";

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse String: " +reverse);

        if(str.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

//       for(int i=str.length()-1;i>=0;i--)
//       {
//           reverse= reverse+str.charAt(i);
//       }
//        System.out.println(str +" is a original string");
//        System.out.println(reverse +" is a reverse string");
    }
}
