package Coding_Preparation_.Practice_IQ_Programs;

public class P9_Reverse_Half_Part_String_Without_StringMethods {
    public static void main(String[] args) {
        String str = "Mahendher";
        int len = str.length();
        int half = len / 2;

        String result = "";

        // Reverse first half
        for (int i = half - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        // Append remaining characters
        for (int i = half; i < len; i++) {
            result += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Half Reversed String: " + result);
    }
}
