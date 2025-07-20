package Coding_Preparation_;
//Reverse Only the First Word
public class String_Revese_First_Word {
    public static void main(String[] args) {
        String input = "Mahendher Good boy";
        String[] words = input.split(" ",2);
        String firstword = new StringBuilder(words[0]).reverse().toString();
        String result = firstword + " " + (words.length > 1 ? words[1] : "");
        System.out.println(result);
    }
}
