//Replace 'a' with '@" from the Mahendher String?
// input= tomorrow output = t3m3223w
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Scanner;

public class P10_Replace_specialChar_InString {
    public static void main(String[] args) {
//         This is hardcoded
//        String str = "Mahendher";
//        String result = str.replace('e','@')
//                        .replace('h','$');
//        System.out.println(result);

//        String str ="tomorrow";
//        String result = str.replace('o','3')
//                .replace('r','2');
//        System.out.println(result);

        //    If dynamically changed
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
