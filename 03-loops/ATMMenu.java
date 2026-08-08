import java.util.Scanner;
public class ATMMenu {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int currentBalance = 25000;
     int choice;
   do {
       System.out.println("1.Check Balance");
      System.out.println("2.Deposite Money");
      System.out.println("3.Withdraw Money");
      System.out.println("4.Exit");

       System.out.print("Choice :");
        choice = sc.nextInt();
        switch (choice) {
       case 1:
       System.out.println("Balance = " + currentBalance);
       break;

       case 2:
         System.out.print("Amount :");
         int depositedAmount = sc.nextInt();
       if (depositedAmount > 0){
         currentBalance += depositedAmount;
       System.out.println("updated Balance = " + currentBalance);
       System.out.println("Money deposited successfuly");
       } else {
         System.out.println("Money not deposited");
       } break;

       case 3:
       System.out.print("Withdraw :");
       int withdrawalAmount = sc.nextInt();
         if(withdrawalAmount < 500) {
            System.out.println("Withdrawal Amount should not less than rs 500");
         } else if(withdrawalAmount > currentBalance) {
            System.out.println("Insufficient Balance");
         } else { 
           currentBalance -= withdrawalAmount;
          System.out.println("Updated Balance = " + currentBalance);
          System.out.println("Withdrawal Successful");
         }
         break;

         case 4:
         System.out.println("Thankyou for visiting");
         break;

           default:
           System.out.println("Invalid Choice");
           break;
        }  
       }while(choice != 4);
        
       
     sc.close();
    }
    
   }
    
