class Employee2 {
    String name;
    double salary;
    int experience;
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        e1.name = "John Doe";
        e1.salary = 46577.20;
        e1.experience = 6;

        Employee2 e2 = new Employee2();
        e2.name = "John Doe";
        e2.salary = 20000;
        e2.experience = 1;

        double bonus;

        if (e1.experience > 5) {
            bonus = e1.salary * (10.0 / 100);
            e1.salary = e1.salary + bonus;
            System.out.println("Bonus: " + bonus);
            System.out.println("Employee1 Final Salary: " + e1.salary);
        }

        if (e2.experience > 5) {
            bonus = e1.salary * (10.0 / 100);
            e2.salary = e2.salary + bonus;
            System.out.println("bonus: " + bonus);
            System.out.println("Employee2 Final Salary: " + e2.salary);
        }
    }
}
