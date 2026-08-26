public class FindNthRoot {
    static int nthRoot (int n, int m) {
        int left = 0;
        int right = m;
        int answer = -1;
       while(left <= right) {
        int mid = (left + right) / 2;
        int power = 1;
        for(int i = 0; i < n; i++) {
            power = power * mid;
        }
        if(power == m) {
            return mid;
        } else if(power < m) {
            
            left = mid + 1;
        } else if(power > m) {
        
           right = mid - 1;
        }
       } 
       return answer;
    }
    public static void main(String[] args) {
        System.out.println(nthRoot(3, 125));
    }
}
