package Coding_Preparation_.Practice_IQ_Programs;

public class SoulaxQ3 {
    public static void main(String[] args) {
        String text = "Hello";

        try {
            System.out.println("Try block: " + text);
        } finally {
            // This doesn't change the original string object,
            // it creates a new one and assigns it to 'text'
            //text = text + " World";
            System.out.println("Finally block: " + text);


        }
    }
}
