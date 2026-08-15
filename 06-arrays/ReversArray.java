public class ReverseArray {
    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
         while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
         }
    
         } 
         public static void main(String[] args) {
            int[] arr = {10,20,30,40,50};
            
            reverseArray(arr);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
         }
         
    }
    


