// Calculator class containing basic arithmetic methods
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int div(int a, int b) {
      if(b == 0) {
        System.out.println("Error division by o is not allowed.");
           return 0;
          }
        return a / b;
    }
}

public class MethodDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition : " + calc.add(10, 39));
        System.out.println("Substraction : " + calc.sub(90, 63));
        System.out.println("Multiplication : " + calc.multiply(68, 54));
        System.out.println("Division : " + calc.div(84, 6));
    }
}
