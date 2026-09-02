public class StringMethodsPractice {
    public static void main(String[] args) {
        String text = "   Java Programming   ";

        System.out.println(text.length());
        System.out.println(text.trim());
         System.out.println(text.toUpperCase());
          System.out.println(text.toLowerCase());
           System.out.println(text.charAt(2));
            System.out.println(text.substring(3, 7));
             System.out.println(text.contains("Java"));
              System.out.println(text.replace("Java", "Python"));
              System.out.println(text.startsWith("   Ja"));
              System.out.println(text.endsWith(" "));
                System.out.println(text.indexOf("Programming"));

              

    }
}
