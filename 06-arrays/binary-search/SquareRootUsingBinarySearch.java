public class SquareRootUsingBinarySearch {
    static int sqrt(int n) {
        int left = 1;
        int right = n;
        int answer = 0;
      while(left <= right) {
        int mid = (left + right) / 2;
        if(mid * mid == n) {
            return mid;
        } else if(mid * mid < n) {
            left = mid + 1;
        } else if (mid * mid > n) {
            answer = mid;
            right = mid - 1;
        }
      }
      return answer;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
}
