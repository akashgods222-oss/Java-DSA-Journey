public class LowerBound {
    static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer = arr.length;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] >= target) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,4,7,9};
        System.out.println(lowerBound(arr,4));
        System.out.println(lowerBound(arr, 6));
        System.out.println(lowerBound(arr, 9));
        System.out.println(lowerBound(arr, 10));
    }
}
