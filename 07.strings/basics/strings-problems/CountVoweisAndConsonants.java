import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Input : ");
     String  input = sc.nextLine();
      int vowels = 0;
      int consonants =0;
        
        for(int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;

            } else if(ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
    }
}
