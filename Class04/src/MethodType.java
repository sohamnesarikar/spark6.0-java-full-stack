public class MethodType {
    //    No parameter and no return value
    void add() {
        int a = 10;
        int b = 20;
        System.out.println("Add: " + (a + b));
    }

    //    Parameters and no return value
    void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }

    //    No parameter and a return value
    int mul() {
        int a = 4;
        int b = 6;
        return a * b;
    }

    //    Parameters and a return value
    double div(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        MethodType mt = new MethodType();
        mt.add();
        mt.sub(34, 13);
        System.out.println("Mul: " + mt.mul());
        System.out.println("Div: " + mt.div(60, 12));
    }
}
