package Coding_Preparation_.Practice_IQ_Programs;

public class P34_SumOfNumbersFromString_Wipro {
    public static void main(String[] args) {
        String str = "zaW3r5y6L@";
        int sum = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
            {
                int digit = Character.getNumericValue(ch);
                sum += digit;
                System.out.println("found"+digit);
            }
        }
        System.out.println("sum is : "+sum);
    }
}

/*My own written

class Main {
    public static void main(String[] args) {
        String str = "xc3r4T6";

        // Extract only numbers from the string
        String n1 = str.replaceAll("[^0-9]", "");  // "346"

        // Convert string to integer
        int n = Integer.parseInt(n1);

        int sum = 0;
        int rem;

        System.out.println("numbers: " + n);

        // Find sum of digits
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        System.out.println("sum of numbers: " + sum);
    }
}
 */