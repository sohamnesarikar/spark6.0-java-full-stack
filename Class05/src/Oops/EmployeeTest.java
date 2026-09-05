package Oops;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        salary = 15000;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Emp id: " + id);
        System.out.println("Emp Name: " + name);
        System.out.println("Emp salary: " + salary);
        System.out.println("------------------");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Employee(102, "Ram", 25000);

        e1.showDetails();
        e2.showDetails();
    }
}
