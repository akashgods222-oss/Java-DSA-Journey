// // Abstract class
abstract class BankOperations {
    abstract void deposit(double amount);
    
    abstract void withdraw(double amount);
}
// Extends abstract class to provide concrete implementation
 class Accounts extends BankOperations {
     private String accountHolder;
     private double balance;
     // static variable 
     static String bankName = "SBI";
     // constructor to initialize object data
   public  Accounts(String accountHolder,double balance) {
         this.accountHolder = accountHolder;
         this.balance = balance;
     }
     @Override
     public void deposit(double amount) {
         if (amount > 0) {
             balance += amount;
             System.out.println("Deposited : " + amount);
         }
     }
     @Override
     public void withdraw(double amount) {
         if(amount <= balance) {
             balance -= amount;
             System.out.println("Withdrawn : " + amount);
         } else {
             System.out.println("Insufficient Balance!");
         }
     }
     
     public double getBalance() {
         return balance;
     }
     
 }
public class BankManagementSystem {
    public static void main(String[] args) {
        
        // Instantiating account object using derived class constructor
        Accounts  c1 = new Accounts("Akash",50000);
        c1.deposit(30000);
        c1.withdraw(60000);
        
        System.out.println("Bank : " + Accounts.bankName + " | Final Balance : " + c1.getBalance());
        
    }
}
