//Write a program to print:
//1
//12
//123
//1234
package Coding_Preparation_.Practice_IQ_Programs;

public class P20_Number_Pattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }
    }
}
