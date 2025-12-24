package Coding_Preparation_.Practice_IQ_Programs;

public class P44_EncapsulationExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("Mahendher");
        System.out.println("Name :"+ bankAccount.getName());
    }
}
 class BankAccount
 {
     String name;
     double balance;

      void setName(String name)
     {
         this.name = name;
     }
     String getName()
     {
         return name;
     }
 }