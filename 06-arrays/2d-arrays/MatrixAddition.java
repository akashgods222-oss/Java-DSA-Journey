public class MatrixAddition {
    static int[][] addMatrix(int[][] a,int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = addMatrix(new int[][] {
            {5,7,8},
            {9,10,11}
        }, new int[][] {
            {12,13,14},
            {15,16,17}
        });
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                  System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
