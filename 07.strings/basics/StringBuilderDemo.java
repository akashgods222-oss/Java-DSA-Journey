public class StringBuilderDemo {
    public static void main(String[] args) {
        String name = "    akash yadav    ";
        String course = "BCA";
        String skills = "Java,HTML,CSS";


        name = name.trim();
        System.out.println(name.toUpperCase());
        System.out.println( name.contains("akash"));

       String splits[] = skills.split(",");
       for(String split : splits) {
        System.out.println(split);
       }
        StringBuilder sb = new StringBuilder(name);
        sb.setCharAt(0,'A');
        sb.setCharAt(6,'Y');
       sb.append(" - " + course + " Student");
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);
    }  
}
