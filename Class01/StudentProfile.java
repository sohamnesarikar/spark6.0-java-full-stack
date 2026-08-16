public class StudentProfile {
    public static void main(String[] args) {
        String studentName = "Jane Smith";
        int rollNo = 15;
        String collegeName = "Abc college";
        String courseName = "Computer science";
        int semester = 3;
        int javaMarks = 75;
        int databaseMarks = 65;
        int webTechMarks = 81;
        int totalMarks = javaMarks + databaseMarks + webTechMarks;
        double percentage = (totalMarks / 300.0) * 100;
        char grade = 'A';
        boolean isPass = true;

        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("College Name: " + collegeName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Semester: " + semester);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Pass status: " + isPass);

        int a = 5;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
