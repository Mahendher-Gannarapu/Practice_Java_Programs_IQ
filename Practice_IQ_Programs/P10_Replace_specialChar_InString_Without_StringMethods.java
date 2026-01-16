package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Scanner;

public class P10_Replace_specialChar_InString_Without_StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine();

        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray())
        {
            if (ch == 'a' || ch == 'A' || ch == 'u' || ch == 'U')
            {
                result.append('$');
            }
            else if(ch== 's' || ch == 'S')
            {
                result.append('@');
            }
            else
            {
                result.append(ch);
            }
        }
        System.out.println("Modified result :" +result.toString());
    }
}
