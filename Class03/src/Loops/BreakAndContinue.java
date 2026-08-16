public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("-------Continue----------");
        for (int i = 1; i <= 20; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------Break---------");
        for (int i = 1; i <= 20; i++) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }
    }
}
