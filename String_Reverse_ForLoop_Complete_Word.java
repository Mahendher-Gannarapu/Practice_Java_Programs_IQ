package Coding_Preparation_;
//Reverse Every Word in the Sentence
import java.util.Scanner;
public class String_Reverse_ForLoop_Complete_Word {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reverse = "";

        for (int i=input.length()-1;i>=0;i--)
        {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(input +" is a original string");
        System.out.println(reverse +" is a reverse string");
    }
}
