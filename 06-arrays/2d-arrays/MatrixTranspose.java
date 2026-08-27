public class MatrixTranspose {
    static int[][] traspose(int[][] arr) {
        int[][] trans = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        int[][] arr = traspose(new int[][] {
            {1,2,3},
            {4,5,6}
        });
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
