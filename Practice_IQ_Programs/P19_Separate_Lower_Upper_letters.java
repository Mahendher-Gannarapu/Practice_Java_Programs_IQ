// Count the Upper and lower letters from the string?
package Coding_Preparation_.Practice_IQ_Programs;

public class P19_Separate_Lower_Upper_letters {
    public static void main(String[] args) {
        String str = "MahenDher Ganna";
        System.out.println(str.length());

        String lower = str.replaceAll("[^a-z]","");
        String upper = str.replaceAll("[^A-Z]","");

        System.out.println("lower letters: "+lower+ " count :" +lower.length());
        System.out.println("upper letters: "+upper+ " count :" +upper.length());

//        int upper = 0, lower = 0;
//
//        for (char ch : str.toCharArray()) {
//            if (Character.isUpperCase(ch)) upper++;
//            else if (Character.isLowerCase(ch)) lower++;
//        }
//
//        System.out.println("Uppercase Letters: " + upper);
//        System.out.println("Lowercase Letters: " + lower);
    }
}

