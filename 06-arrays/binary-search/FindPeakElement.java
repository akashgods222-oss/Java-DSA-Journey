public class FindPeakElement {
    static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
    
         while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] > arr[mid + 1]) {
                right = mid;
                
            } else  {
                left = mid + 1;
            }
         }
         return left;
    }
    public static void main(String[] args) {
        System.out.println(findPeak(new int[] {1,2,3,4,5}));
    }
}
