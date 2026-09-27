// Hides watch details from user
abstract class Watches {
    // Forces subClasses to define their own condition logic
    abstract void condition();
}

 class Titan extends Watches {
 @Override
    public void condition() {
         System.out.println("Watch is in working condition.");
     }
 }

class Rolex extends Watches {
@Override
    public void condition() {
        System.out.println("Watch is not working");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
    // Allows switching watch objects dynamically
        Watches myTitan = new Titan();
        myTitan.condition();
        
        Watches myRolex = new Rolex();
        myRolex.condition();
    }
}
