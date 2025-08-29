package Coding_Preparation_.Practice_IQ_Programs;

public class P36_Count_A_in_String {
    public static void main(String[] args) {

        String str ="MahenaaaAAdherA a";
        int count=0;
            for(char c:str.toCharArray())
            {
                if(c=='A'||c=='a')
                {
                    count++;
                }
            }
        System.out.println(count);
        }
    }

