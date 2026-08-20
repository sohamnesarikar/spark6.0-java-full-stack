class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println("Add: " + c.add(10, 20));
        System.out.println("Subtract: " + c.subtract(45, 20));
        System.out.println("Multiply: : " + c.multiply(8, 3));
        System.out.println("Divide: : " + c.divide(35, 5));
    }
}
