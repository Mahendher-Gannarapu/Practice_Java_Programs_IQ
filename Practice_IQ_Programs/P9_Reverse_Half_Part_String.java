//Reverse the half part of the String?
package Coding_Preparation_.Practice_IQ_Programs;

public class P9_Reverse_Half_Part_String {
    public static void main(String[] args) {

        String str = "Mahendher";
        int mid = str.length()/2;

        //Reverse first_half
//        String first_half = new StringBuilder(str.substring(0,mid)).reverse().toString();
//        String second_half = str.substring(mid);
//        System.out.println(first_half+second_half);

        //Reverse second_half
        String second_half = new StringBuilder(str.substring(mid)).reverse().toString();
        String first_half =str.substring(0,mid);
        System.out.println(first_half+" "+second_half);

        //upto print mid word
        //String first_half = str.substring(0,mid);
        //System.out.println(first_half);

        //print mid to last word
        //String second_half = str.substring(mid);
        //System.out.println(second_half);
    }
}



public class ReverseHalf {
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

