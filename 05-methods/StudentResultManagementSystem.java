import java.util.Scanner;
public class StudentResultManagementSystem{
    
    static int getValidMarks(Scanner sc , String subject) {
        int marks;
        while(true) {
            System.out.print(subject + "Marks :");
            marks = sc.nextInt();

            if(marks >= 0 && marks <= 100) {
             return marks;
            }
            System.out.println("Invalid Marks! Enter between 0 and 100." );
        }
    }
    
    // calculates the total marks
    static int calculateTotal(int a, int b ,int c, int d,int e ) {
        int  total = a + b + c + d + e;
         return total;
    }
    // calculates the percentage on basis of total outof 500
    static double calculatePercentage(int total) {
      double percentage = (total / 500.0) * 100;
      return percentage;
    }
    // finds grade on basis of percentage
    static String findGrade(double percentage) {
        if(percentage >= 90) {
            return "A+";
        } else if(percentage >= 80) {
            return "A";
        }else if(percentage >= 70) {
            return "B";
        }else if(percentage >= 60) {
            return "C";
        }else if(percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    // to check student is pass or fail
    static boolean isPassed(int a,int b,int c,int d, int e) {
        if(a <= 35 || b <= 35 || c <= 35 || d <= 35 || e <= 35) {
            return false;
        } else {
            return true;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take marks name & roll number from user as input 
        System.out.println("========== STUDENT RESULT ==========");
        System.out.print("Name       :");
        String name = sc.next();
        System.out.print("Roll Number:");
        int rollNo = sc.nextInt();
        
        int javaMarks = getValidMarks(sc, "Java");
        
        int cMarks = getValidMarks(sc, "C");
        
        int englishMarks = getValidMarks(sc, "English");

        int mathsMarks = getValidMarks(sc, "Maths");
        
        int computerMarks = getValidMarks(sc, "Computer");


        // to print total by calling total method
        int total = calculateTotal(javaMarks, cMarks, englishMarks, mathsMarks, computerMarks);
        System.out.println("Total      :" + total + "/500");

        // to print percentage by calling percentage method
        double percentage = calculatePercentage(total);
        System.out.println("percentage :" + percentage);

        // to print grade by calling findGrade method 
        String grade =findGrade(percentage);
        System.out.println("Grade      :" + grade);
        
        
        // to print pass/fail status by calling isPassed method
        boolean status = isPassed(javaMarks, cMarks, englishMarks, mathsMarks, computerMarks);
        
            System.out.println("Status     :" + (status ?  "PASS" : "FAIL"));

System.out.println("====================================");
   
   sc.close();
    }    

}
