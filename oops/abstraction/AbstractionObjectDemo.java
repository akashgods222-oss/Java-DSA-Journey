// Abstract Class with instance variables and constructor
abstract class Watch {
    String brand;
    double price;

    // Abstract class constructor 
    Watch(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Abstract method
    abstract void showDetails();
}

class SmartWatch extends Watch {
    int batteryLife;

    SmartWatch(String brand, double price, int batteryLife) {
        // Parent class ke constructor ko call kar rahe hain
        super(brand, price);
        this.batteryLife = batteryLife;
    }

    @Override
    public void condition() { 
        System.out.println("Brand: " + brand + ", Price: " + price + ", Battery: " + batteryLife + " hrs");
    }
}

public class AbstractionObjectDemo {
    public static void main(String[] args) {
        // Abstract class reference holding child object initialized with values
        Watch myWatch = new SmartWatch("Apple", 30000.0, 24);
        myWatch.showDetails();
    }
}
