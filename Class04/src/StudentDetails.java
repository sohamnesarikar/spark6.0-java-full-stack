class Student {
    String name;
    int age;
    int rollNumber;
    int marks;

    void StudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("marks: " + marks);
    }

    String getResult() {
        return marks >= 40 ? "Pass" : "fail";
    }
}


public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ram Singh";
        student.rollNumber = 67;
        student.age = 18;
        student.marks = 75;

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Age: " + student.age);
        System.out.println("marks: " + student.marks);
        System.out.println("Result: " + student.getResult());
    }
}
