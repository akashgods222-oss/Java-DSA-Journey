public class MatrixMultiplication {
    static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                int sum = 0;
                for(int k = 0;k < a[0].length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[][] arr = multiplyMatrix(new int[][] {
            {1,2,3},
            {4,5,6}
        }, new int[][] {
            {7,8,9},
            {10,11,12},
            {6,7,8}
        });
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
             System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
