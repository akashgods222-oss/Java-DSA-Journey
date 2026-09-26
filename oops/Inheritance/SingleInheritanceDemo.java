// Parent class (Superclass)
 class Employee {
     String name;
     double salary;
     
     //base constructor
     Employee(String name,double salary) {
         this.name = name;
         this.salary = salary;
     }
     
    public void displayDetails() {
         System.out.println("Name : " + name);
         System.out.println("Salary : " + "Rs " + salary);
     }
 }

// Child class(Subclass) accquiring properties of Employee 
class Developer extends Employee {
    String programmingLanguage;
    
    // Constructor using super to pass value to parent constructor
    Developer (String name, double salary, String programmingLanguage) {
        super(name,salary); // calls parent constructor
        this.programmingLanguage = programmingLanguage;
    }
    
   public void displayDeveloperInfo() {
        displayDetails(); // calling inherited method
        System.out.println("Domain : " + programmingLanguage + " Developer");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Creating child class object
        Developer dev = new Developer("Akash",45000,"Java");
        
        dev.displayDeveloperInfo();
    }
}
