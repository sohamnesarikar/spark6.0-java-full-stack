public class ObjectInArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student s1 = new Student();
        s1.name = "John";
        s1.marks = 78;

        Student s2 = new Student();
        s2.name = "Mark";
        s2.marks = 54;

        Student s3 = new Student();
        s3.name = "Anjali";
        s3.marks = 91;

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student data : students) {
            System.out.println(data.name + " has " + data.marks + " marks.");
        }
    }
}
