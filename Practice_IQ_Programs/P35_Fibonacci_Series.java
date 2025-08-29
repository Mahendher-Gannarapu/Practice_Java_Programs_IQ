//Given element, determine if it is present in the Fibbonacci series?
package Coding_Preparation_.Practice_IQ_Programs;

public class P35_Fibonacci_Series {
    public static void main(String[] args) {
        int a = 0, b = 1, c, n = 10, x = 20;
        boolean found = false;
        System.out.println(a + "\n" + b);
        if (a == x || b == x)
            found = true;
        c = a + b;

        while (n >= c) {
            System.out.println(c);
            if (c == x)
                found = true;
            a = b;
            b = c;
            c = a + b;
        }
            if (found) {
                System.out.println("the x value available in the series");
            } else {
                System.out.println("not available in the series");
            }
        }
    }

