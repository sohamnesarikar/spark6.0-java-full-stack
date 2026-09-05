package  ClassAndObject;

class Student {
    String name;
    int age;
    int rollNo;
    int marks;
}


public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rohan Das";
        s1.age = 16;
        s1.rollNo = 45;
        s1.marks = 75;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("RollNo: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);

        System.out.println("-------------------------");

        s2.name = "Mukesh Kumar";
        s2.age = 17;
        s2.rollNo = 61;
        s2.marks = 81;

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("RollNo: " + s2.rollNo);
        System.out.println("Marks: " + s2.marks);
    }
}



