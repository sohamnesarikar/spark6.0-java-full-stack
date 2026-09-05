package Oops;

class Course {
    String courseName;
    int duration;
    double fees;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public Course(String courseName, int duration, double fees) {
        this(courseName, duration);
        this.fees = fees;
    }

    void ShowDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " Months");
        System.out.println("Fees: " + fees);
        System.out.println("------------------");
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Course course = new Course("Spark 6.0", 6, 5999);
        course.ShowDetails();
    }
}
