public class FloorCeil {
    static int[] floorCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer[] = {-1,-1};
           while(left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
             answer[0] = arr[mid];
             answer[1] = arr[mid];
             break;
            
           }else if(arr[mid] <= target) {
                answer[0] = arr[mid];
                left = mid + 1;

            } else if(arr[mid] >= target) {
                answer[1] = arr[mid];
                right = mid - 1;
            }
           }
           return answer;
    }
    public static void main(String[] args) {
        int[] result = floorCeil(new int[] {2,4,6,8,10}, 7);
    
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] +" ");
        }
    }
}
