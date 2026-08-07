import java.util.Scanner;
public class NestedIf{
  public static  void main(String[] args) {
    // Take cgpa and attendence as a input from user 
    Scanner sc = new Scanner(System.in);
    System.out.print("CGPA:");
    double cgpa = sc.nextDouble();
    System.out.print("Attendence Percentage:");
    int attendence = sc.nextInt();

    if(cgpa >= 7.0) {
      if(attendence >= 75) {
        System.out.println("Eligible for placement");
      } else {
        System.out.println("Not eligible due to low attendence");
      }
    } else {
      System.out.println("Not eligible due to low CGPA");
    }
  }
  sc.close();
}
