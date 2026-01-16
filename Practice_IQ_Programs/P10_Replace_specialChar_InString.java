//Replace 'a' with '@" from the Mahendher String?
// input= tomorrow output = t3m3223w
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Scanner;

public class P10_Replace_specialChar_InString {
    public static void main(String[] args) {
        String str = "Mahendher";
        String result = str.replace('e', '@')
                .replace('h', '$');
        System.out.println(result);

        String str1 = "tomorrow";
        String result1 = str1.replace('o', '3')
                .replace('r', '2');
        System.out.println(result1);

    }
}

