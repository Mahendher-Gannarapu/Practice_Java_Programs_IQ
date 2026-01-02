package Coding_Preparation_.Practice_IQ_Programs;

class AgeInValidException1 extends Exception
{
    public AgeInValidException1(String msg)
    {
        super(msg);
    }
}
public class P47_Create_Custom_Exception_Try_Catch_Block {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new AgeInValidException1("age must be 18 and above");
            }
            System.out.println("Eligible");
        } catch (AgeInValidException1 e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
public class P47_Create_Custom_Exception_Try_Catch_Block {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new AgeInValidException1("age must be 18 and above");
            }
            System.out.println("Eligible");
        } catch (AgeInValidException1 e) {
            System.out.println(e.getMessage());
        }
    }
}
 */