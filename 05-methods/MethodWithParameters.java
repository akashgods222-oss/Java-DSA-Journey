public class MethodWithParameters {
    static int findMAx(int a, int b, int c){
        if(a >= b && a >= c) {
         return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        int result = findMAx(100, 2000, 5000);
        System.out.print(result);
    }
}
