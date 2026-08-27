public class DiagonalSum {
    static int diagonalSum(int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if(i != arr.length - 1 - i) {
            sum += arr[i][arr.length - 1 - i];
        }
    }
    return sum;

    }
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][] {
            {2,4,6},
            {8,10,12},
            {14,16,18}
        }));
    }
}
