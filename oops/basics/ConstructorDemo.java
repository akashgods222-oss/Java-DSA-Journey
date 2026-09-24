// class
class Watch {
    String brand;
    int launchYear;
    
    //Parameterized Constructor
    Watch (String brand, int launchYear) {
        this.brand = brand;
        this.launchYear = launchYear;
    }
    // Method
    void displayInfo() {
        System.out.println( brand + " - " + launchYear);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
    // Creating objects using constructor
        Watch w1 = new Watch("Rolex",1997);
        Watch w2 = new Watch("Titan",2003);
        
      // Calling methods using objects  
        w1.displayInfo();
        w2.displayInfo();
    }
}

