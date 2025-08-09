//30.	Write a Java program to convert uppercase to lowercase and vice versa
// (𝗘𝘅𝗮𝗺𝗽𝗹𝗲: Input :HexAwarE → Output: hEXaWARe).
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Scanner;
public class P30_ToUpperCase_ToLowerCase_ViseVersa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = input.nextLine();

        StringBuilder result = new StringBuilder();
        for(char ch :str.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch))
            {
                result.append(Character.toUpperCase(ch));
            } else
            {
                result.append(ch);
            }
        }
        System.out.println("Modified String : " +result.toString());
    }
}
