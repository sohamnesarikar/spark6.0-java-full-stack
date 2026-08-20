class Product {
    String name;
    double price;
    int quantity;
}

public class ProductDetails {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Dinner set";
        p1.price = 3400;
        p1.quantity = 2;

        double totalPrice = p1.price * p1.quantity;
        System.out.println("Total Price: " + totalPrice);
    }
}
