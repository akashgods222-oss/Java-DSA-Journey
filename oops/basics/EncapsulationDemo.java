/ Parent class
class Instagram {
    public String name;
    protected String email;
    private String password;
    
    // To access private variable
    public void setPassword(String pass) {
        this.password = pass;
    }
    
    public String getPassword() {
        return this.password;
    }
}

// subclass using parent
class User extends Instagram {
   // method for public and protected access modifiers 
    public void displayInfo() {
        name = "Akash";
        email ="akashyadav@gmail.com";
        // password = "abcd"; // compilation error: private member are not accessible directly
        
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
    }
}


public class EncapsulationDemo {
    public static void main (String[] args) {
        User user1 = new User();
        user1.displayInfo();
        
        user1.setPassword("Ak@$#8830");
        System.out.println("Password : " + user1.getPassword());
    }
}
