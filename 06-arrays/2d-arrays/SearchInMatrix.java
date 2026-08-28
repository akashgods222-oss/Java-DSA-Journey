public class SearchInMatrix {
    static  boolean isAvailable(int[][] arr,int target) {
         for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return true;
                }
            }
         }
         return false;
    }
    public static void main(String[] args) {
        boolean arr = isAvailable(new int[][] {
            {10,20,30},
            {40,90,60},
            {70,80,90}
        }, 50);
        System.out.println(arr);
    }
}
