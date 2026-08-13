class Employee {
    int employeeId;
    String employeeName;
    double monthlySalary;
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.employeeId = 267;
        e.employeeName = "John Doe";
        e.monthlySalary = 46577.20;

        int annualSalary = (int) (e.monthlySalary * 12);
        System.out.println("Annual Salary: " + annualSalary);
    }
}
