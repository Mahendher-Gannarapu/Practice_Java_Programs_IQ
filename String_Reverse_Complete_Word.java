package Coding_Preparation_;
//Reverse Every Word in the Sentence
public class String_Reverse_Complete_Word {
    public static void main(String[] args) {

        String input = "Mahendher good boy";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word :  words)
        {
            result.append(new StringBuffer(word).reverse().toString()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
