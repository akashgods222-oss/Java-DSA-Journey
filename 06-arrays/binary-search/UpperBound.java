public class UpperBound {
    static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer = arr.length;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] > target) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(upperBound(new int[] {2,4,4,7,9}, 4));
        System.out.println(upperBound(new int[] {2,4,4,7,9}, 7));
        System.out.println(upperBound(new int[] {2,4,4,7,9}, 9));

    }
}
