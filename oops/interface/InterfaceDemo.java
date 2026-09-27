interface Vehicle {
    void drive();
}

interface Car{
  void wheels();
}
//Multiple interfaces implementation to achive multiple inheritance in java
class Tata implements Vehicle,Car {
@Override
    public void drive() {
        System.out.println("vehicle is driving on road");
    }
    @Override
     public void wheels() {
         System.out.println("It has 4 wheels");
     }
}

public class InterfaceDemo {
    public static void main( String[] args) {
    // Direct implementation object used to access method from both interfaces
        Tata t1 = new Tata();
        t1.drive();
        t1.wheels();
    }
}
