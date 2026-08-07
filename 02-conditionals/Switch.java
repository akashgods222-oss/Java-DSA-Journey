import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // to take choice input from user 
    System.out.println("1.Addition");
    System.out.println("2.Substraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    System.out.print("Choice:");
    int choice = sc.nextInt();
// take numbers input from user
  System.out.print("Num1:");
  int num1 = sc.nextInt();
  System.out.print("Num2:");
  int num2 = sc.nextInt();
 
  switch (choice) {
             case 1:
                System.out.println("Answer ="+ (num1 + num2));
                break;

             case 2:
                    System.out.println("Answer ="+ (num1 - num2));
                    break;

             case 3:
                    System.out.println("Answer ="+ (num1 * num2));
                        break;

             case 4:
                if(num2 != 0) {
                    System.out.println("Answer ="+ (num1 / num2));
                     } else {
                    System.out.println("Cannot divide by zero");
                     }
                     break;

                      default:
                       System.out.println("Invalid Choice");
       }
        sc.close();
    }
}
 
