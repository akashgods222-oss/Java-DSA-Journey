// Base class
class Vehicle {
    void engineStarts() {
        System.out.println("Engine Is Starting...");
    }
 }

// Derived class from base class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving on road");
    }
}

//Derived class from car (multilevel)
class EvCar extends Car {
    void charging() {
        System.out.println("EV cars battery is charging....");
    }
}

public class MultiLevelInheritanceDemo {
    public static boid main(String[] args) {
    //Grandchild object has access all grandparents and parents method
        EvCar myTesla = new EvCar();
        myTesla.engineStarts(); //From Vehicle
        myTesla.drive(); // From Car
        myTesla.charging(); // From EvCar
        
        
    }
}
