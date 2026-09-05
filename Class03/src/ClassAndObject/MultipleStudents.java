package ClassAndObject;

public class MultipleStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohan Das";
        s1.age = 16;
        s1.rollNo = 45;
        s1.marks = 75;

        Student s2 = new Student();
        s2.name = "Mukesh Kumar";
        s2.age = 17;
        s2.rollNo = 61;
        s2.marks = 81;
        
        Student s3 = new Student();
        s3.name = "Kabir Singh";
        s3.age = 14;
        s3.rollNo = 74;
        s3.marks = 77;

        if (s1.marks == s2.marks && s2.marks == s3.marks) {
            System.out.println("All students has same marks");
        } else if (s1.marks >= s2.marks && s1.marks >= s3.marks) {
            System.out.println("Student 1 has highest marks");
        } else if (s2.marks >= s1.marks && s2.marks >= s3.marks) {
            System.out.println("Student 2 has highest marks");
        } else {
            System.out.println("Student 3 has Highest marks");
        }
    }
}
