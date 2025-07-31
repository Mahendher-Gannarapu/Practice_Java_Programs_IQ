//Star Pattern left, right and triangle?
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Scanner;

public class P17_Star_Patterns_Left_Right_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        /*
Enter a number
4
****
***
**
*
 */
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        /*

         *
         **
         ***
         ****
         *****

         */


        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        /*

         *
         * *
         * * *
         * * * *
         */



        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

        /*
           *
          ***
         *****
        *******
         */
    }
}
