package Coding_Preparation_.Practice_IQ_Programs_Repeated;


public class P4_Custom_Exceptions_Throws {
    public static void main(String[] args) throws OTPInvalidException
    {
        int otp = 1234;
        int current_otp = 1111;

        if(otp!=current_otp){
            throw new OTPInvalidException("OTP is invalid");
        }
    }
}

class OTPInvalidException extends Exception
{
    public OTPInvalidException(String msg)
    {
        super(msg);
    }
}
