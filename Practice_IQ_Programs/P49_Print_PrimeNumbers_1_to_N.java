/*
“I loop through numbers from 1 to 50.
For each number, I count how many divisors it has.
If a number has exactly 2 divisors (1 and itself), it is prime.”
 */

package Coding_Preparation_.Practice_IQ_Programs;

public class P49_Print_PrimeNumbers_1_to_N {
    public static void main(String[] args) {
        int count;

        for(int n=1;n<=50;n++)
        {
            count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(n+" ");
            }
        }
    }
}

/*
public class P49_Print_PrimeNumbers_1_to_N {
    public static void main(String[] args) {
        int count;

        for(int n = 2; n <= 10; n++) {
            count = 0;

            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    count++;
                    break;
                }
            }

            if(count == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
 */