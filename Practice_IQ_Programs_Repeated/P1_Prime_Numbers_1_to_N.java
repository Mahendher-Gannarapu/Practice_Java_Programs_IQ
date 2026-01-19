package Coding_Preparation_.Practice_IQ_Programs_Repeated;

public class P1_Prime_Numbers_1_to_N
{
    public static void main(String[] args) {

        int n,count;

        for(n=20;n<=30;n++)
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
                System.out.println(n+" ");
            }
        }
    }
}
