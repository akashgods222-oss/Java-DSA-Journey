class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {

        Student student = new Student("Akash", 21);

        student.display();
    }
}
