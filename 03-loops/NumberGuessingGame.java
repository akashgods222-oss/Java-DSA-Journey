import java.util.Scanner;
public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int secretNumber = 94;
    int attempts = 0;
    boolean gussed = false;
    while(attempts < 10) {
     
      // take number as input from user
      System.out.print("Guess the number :");
      int number = sc.nextInt();
      attempts++;
      if (number > secretNumber) {
        System.out.println("Too high!");
        
      } else if (number < secretNumber) {
         System.out.println("Too low!");
        
      } else  {
         System.out.println("Correct");
         System.out.println("You guuessed it in " + attempts + "attempts");
        gussed =true;
        break;
      } 
      if (!guessed) {
        System.out.println("Game Over!");
        System.out.println("The correct number was" + secretNumber);
      }
    }
    sc.close();
  }
}

  
