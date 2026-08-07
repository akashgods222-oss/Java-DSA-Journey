import java.util.Scanner;
public class MultiplicationTableGenerator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // take number & range as input from user
    System.out.print("Enter Number :");
    int number = sc.nextInt();
    System.out.print("Enter Range :");
    int range = sc.nextInt();

    for(int i = 1; i <= range; i++) {
      System.out.println(number + " X " + i + " = " + (number * i));
    }
sc.close();
  }
}
