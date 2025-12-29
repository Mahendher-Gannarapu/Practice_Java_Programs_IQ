package Coding_Preparation_.Practice_IQ_Programs;

class AgeInValidException extends Exception
{
    public AgeInValidException(String msg)
    {
        super(msg);
    }
}
public class P46_Cretae_Custom_Exception {
    public static void main(String[] args) throws AgeInValidException
    {
            int age=16;

            if(age<18)
            {
                throw new AgeInValidException("age must be 18 and above");
            }
    }
}
