package Coding_Preparation_.Practice_IQ_Programs;

public class P12_Count_Vowels_Consonants_FromString {
    public static void main(String[] args) {

        String input= "Mahendher";
        String str= input.toLowerCase();
        int vowels =0;
        int consonants =0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels++;
                } else
                {
                    consonants++;
                }

            }
        }
        System.out.println("Vowels count: "+vowels);
        System.out.println("Consonants count: "+consonants);
    }
}

