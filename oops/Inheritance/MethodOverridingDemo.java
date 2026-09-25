// Base bank class
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

// SBI Child class overriding parent method
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 7.5;
    }
}

// HDFC child class overriding parent method
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 12.5;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        
        System.out.println("SBI interest = " + sbi.getInterestRate() + "%");
        System.out.println("HDFC interest = " + hdfc.getInterestRate() + "%");
    }
}
