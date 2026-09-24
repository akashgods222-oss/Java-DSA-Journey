// class
class Car {
    String name;
    int modelNo;
    // method
    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Model No : " + modelNo);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
      // creating an object of car class
        Car c1 = new Car();
      // assigning values to object properties
        c1.name = "Range Rover";
        c1.modelNo = 6674;
       // calling method using object
        c1.displayInfo();
    }
}
