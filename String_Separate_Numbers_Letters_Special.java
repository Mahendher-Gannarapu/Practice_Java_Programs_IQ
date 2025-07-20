// Input : Mahi1234
// Output : 1234

package Coding_Preparation_;

public class String_Separate_Numbers_Letters_Special {
    public static void main(String[] args) {

        String input = "Mahi1234Mahi@#$&*";
        String numbers = input.replaceAll("[^0-9]", "");
        String letters = input.replaceAll("[^a-zA-Z]", "");
        String chars = input.replaceAll("[a-zA-Z0-9]", "");
        System.out.print(numbers);
        System.out.print("\t" +letters);
        System.out.print("\t" +chars);
    }
}
