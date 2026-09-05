package Oops;

class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Student extends User {
    String courseName;

    Student(String name, String email, String courseName) {
        super(name, email);
        this.courseName = courseName;
    }

    @Override
    void showProfile() {
        super.showProfile();
        System.out.println("Course Name: " + courseName);
        System.out.println("--------------------");
    }
}

class Trainer extends User {
    String subject;

    Trainer(String name, String email, String subject) {
        super(name, email);
        this.subject = subject;
    }

    @Override
    void showProfile() {
        super.showProfile();
        System.out.println("Subject: " + subject);
    }
}

public class OnlineLearningSystem {
    public static void main(String[] args) {
        Student student = new Student("Rahul", "rahul23@gmail.com", "Spark 6.0");
        student.showProfile();

        Trainer trainer = new Trainer("Ashwani", "ashwani76@cfs.com", "Java");
        trainer.showProfile();
    }

}
