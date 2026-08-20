public class MultipleStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram Singh";
        s1.rollNumber = 67;
        s1.marks = 77;

        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("marks: " + s1.marks);

        System.out.println("*********************");

        Student s2 = new Student();
        s2.name = "Anushka Sharma";
        s2.rollNumber = 24;
        s2.marks = 55;

        System.out.println("Name: " + s2.name);
        System.out.println("Roll Number: " + s2.rollNumber);
        System.out.println("marks: " + s2.marks);

        System.out.println("*********************");

        Student s3 = new Student();
        s3.name = "Mira Kale";
        s3.rollNumber = 45;
        s3.marks = 85;

        System.out.println("Name: " + s3.name);
        System.out.println("Roll Number: " + s3.rollNumber);
        System.out.println("marks: " + s3.marks);

        System.out.println("**************************");
        if (s1.marks == s2.marks && s2.marks == s3.marks) {
            System.out.println("All students have equal marks");
        } else if (s1.marks >= s2.marks && s1.marks >= s3.marks) {
            System.out.println("Student " + s1.name + " has highest marks");
        } else if (s2.marks >= s1.marks && s2.marks >= s3.marks) {
            System.out.println("Student " + s2.name + " has highest marks");
        } else {
            System.out.println("Student " + s3.name + " has highest marks");
        }
    }
}
