package Arrays;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showDetails() {
        System.out.println("Student " + name + " has get " + marks + " marks.");
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Student arr[] = new Student[3];

        arr[0] = new Student("Rahul", 56);
        arr[1] = new Student("Ajay", 80);
        arr[2] = new Student("Ram", 40);

        for (Student std : arr) {
            std.showDetails();
        }
    }
}
