package Coding_Preparation_;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayList_Ex {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Mango");
        list.add("Bannana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Before Reverse list"+ list);
        Collections.reverse(list);
        System.out.println("After Reverse List"+ list);


    }
}
