public class SimpleCalculatorWithSwitch {
    public static void main(String[] args) {
        int a = 20, b = 3;
        char operator = '+';
        int result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Addition: " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Substraction: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Multiplication: " + result);
                break;

            case '/':
                result = a / b;
                System.out.println("Division: " + result);
                break;

            case '%':
                result = a % b;
                System.out.println("Remainder: " + result);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
