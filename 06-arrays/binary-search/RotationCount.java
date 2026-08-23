public class RotationCount {
     static int rotationCount(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(rotationCount(new int[] {4,5,6,7,0,1,2}));
    }
    
}
