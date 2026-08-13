public class ProductStock {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Dinner set";
        p1.price = 3400;
        p1.quantity = 2;

        Product p2 = new Product();
        p2.name = "Samsung A71";
        p2.price = 67000;
        p2.quantity = 1;

        Product p3 = new Product();
        p3.name = "Harry potter book";
        p3.price = 477.50;
        p3.quantity = 0;

        if (p1.quantity > 0.0) {
            System.out.println("Product 1 quantity is greater than 0");
        }

        if (p2.quantity > 0.0) {
            System.out.println("Product 2 quantity is greater than 0");
        }

        if (p3.quantity > 0.0) {
            System.out.println("Product 3 quantity is greater than 0");
        }
    }
}
