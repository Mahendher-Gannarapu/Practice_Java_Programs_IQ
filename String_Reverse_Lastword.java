package Coding_Preparation_;
//Reverse Only the Last Word
public class String_Reverse_Lastword {
    public static void main(String[] args) {
        String input = "Mahendher is good";
        String[] words = input.split(" ");
        if (words.length > 0) {
            words[words.length - 1] = new StringBuilder(words[words.length - 1]).reverse().toString();
        }
        System.out.println(String.join(" ", words));
    }
}

