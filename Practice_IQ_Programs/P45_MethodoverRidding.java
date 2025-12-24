package Coding_Preparation_.Practice_IQ_Programs;

import java.sql.SQLOutput;

class Employee
{
    void work() {
        System.out.println("Employee work");
    }
}
class Tester extends Employee
{
    @Override
    void work() {
        System.out.println("Tester work");
    }
}
public class P45_MethodoverRidding {
    public static void main(String[] args) {
        Employee e = new Tester();
        e.work();
    }
}
