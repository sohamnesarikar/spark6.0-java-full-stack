public class LoginCheck {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123";

        if (username == "admin") {
            if (password == "123") {
                System.out.println("Login Successful");
            } else {
                System.out.println("incoorect password");
            }
        } else {
            System.out.println("Username is incorrect");
        }
    }
}
