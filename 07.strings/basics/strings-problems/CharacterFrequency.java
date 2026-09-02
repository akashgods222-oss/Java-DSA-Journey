import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input: ");
      String input = sc.nextLine();
      System.out.println("Target: ");
      char target = sc.next().charAt(0);
        int count = 0;


      for(int i = 0; i < input.length(); i++) {
        if(input.charAt(i) == target) {
            count++;
        }
      }
      System.out.println("Frequency: " + count );

      sc.close();
    }
}
