package Coding_Preparation_.Practice_IQ_Programs_Repeated;

public class P5_Custom_Exception_Try_Catch {
    public static void main(String[] args) {
        int otp = 1111;

        try
        {
            if(otp!=111)
            {
                throw new OTPInvalidException1("OTP is invalid");
            }
        }catch(OTPInvalidException1 e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class OTPInvalidException1 extends Exception
{
    public OTPInvalidException1(String msg)
    {
        super(msg);
    }
}
