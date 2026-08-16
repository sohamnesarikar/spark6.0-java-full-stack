public class ElectricityBill {
    public static void main(String[] args) {
        int units = 180;

        int first100Units = units - 80;
        int remainingUnits = units - first100Units;

        int totalBill = (first100Units * 5) + (remainingUnits * 8);
        System.out.println("Total Bill: " + totalBill);
    }
}
