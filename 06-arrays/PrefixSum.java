public class PrefixSum {
  ststic int[] prefixSum(int[] arr) {
    int[] prefix = new int[arr.length];
    prefix[0] = arr[0];

  for(int i = 1; i < arr.length; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
  }
    return prefix;
  }
  public static void main(String[] args) {
    int[] result = prefixSum( new int[] {5,3,2,10});
    for(int i = 0; i < arr.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
