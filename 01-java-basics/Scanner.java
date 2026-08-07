public class Scanner {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name:");
          String name = sc.next();



        System.out.println("Enter your age:"); 

        int age= sc.nextInt();
        
        
        
        System.out.println("Myself "+ name + " and I am " + age + " years old" );

        sc.close();

        

    }
}
