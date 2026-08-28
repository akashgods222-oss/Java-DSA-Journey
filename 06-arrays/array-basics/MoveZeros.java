public class MoveZeros {
    static void moveZeros(int[] arr) {
       int index = 0;
       for(int i = 0; i < arr.length ; i++) {
        if(arr[i] != 0) {
          arr[index] = arr[i];
            index++;

        }
    }   
    
     while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
       
    }
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,8};
        moveZeros(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
