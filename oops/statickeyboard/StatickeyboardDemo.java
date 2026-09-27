class Customer {
    String name;
    // Memory shared across the all instances to avoid duplication
    static String bank;
    
    // Allows updating shared bank data globally without instantiating objects
public static void changeBank() {
    bank = "newsbank";
}
}

public class StaticKeyboard {
    public static void main(String[] args) {
    // Direct class reference used because static belongs to class not objects
        Customer.bank = "SBI";
        
        Customer c1 = new Customer();
        c1.name = "Akash";
        System.out.println("Name : " + c1.name + " Bank :  " + Customer.bank);
        Customer c2 = new Customer();
        c2.name = "Rahul";
        System.out.println("Name : " + c2.name + " Bank :  " + Customer.bank);
    }
}
