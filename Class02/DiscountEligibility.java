public class DiscountEligibility {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSeniorCitizen = false;

        if (isStudent || isSeniorCitizen) {
            System.out.println("Discount available");
        } else {
            System.out.println("No discount");
        }
    }
}
