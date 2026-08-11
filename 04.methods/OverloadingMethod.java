public class OverloadingMethod {
    static int area(int side) {
         return side * side;
    }
     
    static int area(int length , int breadth) {
        return length * breadth;
    }

    static double area(double radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        int result =area(8);
        int result2 = area(9, 5);
        double result3 =area(9.0);
            System.out.println(result);
            System.out.println(result2);
            System.out.println(result3);
        
    }
}
