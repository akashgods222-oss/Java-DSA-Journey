public class ReverseString {
    public static void main(String[] args) {
        String text = "Hello java";
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println(sb);
    }
}
