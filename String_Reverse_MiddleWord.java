package Coding_Preparation_;
//Reverse Only the Middle Word (when 3+ words)
public class String_Reverse_MiddleWord {
    public static void main(String[] args) {
        String input = "Yes Mahendher have good attitude";
        String[] words = input.split(" ");
        if (words.length >= 3) {
            int mid = words.length / 2; // middle index
            words[mid] = new StringBuilder(words[mid]).reverse().toString();
        }
        System.out.println(String.join(" ", words));
    }
}
