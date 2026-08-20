public class ProductService {
    String name;
    double price;
    int quantity;

    double calculateTotal() {
        return price * quantity;
    }

    public static void main(String[] args) {
        ProductService product = new ProductService();
        product.name = "Blankets";
        product.price = 1340;
        product.quantity = 2;

        System.out.println("Product: " + product.name);
        System.out.println("Total amount: " + product.calculateTotal());
    }
}
