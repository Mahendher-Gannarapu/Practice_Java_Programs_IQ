//str="abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";
//WAP to get to count of times the substring @#% is repeating.
package Coding_Preparation_.Practice_IQ_Programs;

public class P22_Count_SubString_FromString {
    public static void main(String[] args) {

        String str = "abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";

        // Split the string on the substring "@#%"
        String[] parts = str.split("@#%");

        // Number of times "@#%" appears = number of splits - 1
        int count = parts.length - 1;

        System.out.println("Count of '@#%' is: " + count);

    }
}
