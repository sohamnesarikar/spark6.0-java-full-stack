package Oops;

class Product {
    String name;
    int quantity;
    double price;
   

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double calculateTotal() {
        return price * quantity;
    }

    void showBill() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + calculateTotal());
        System.out.println("-------------------------------");
    }
}


public class ProductBill {
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 5, 10);
        Product p2 = new Product("Sugar", 1, 345);
        Product p3 = new Product("Soap", 5, 30);

        p1.calculateTotal();
        p2.calculateTotal();
        p3.calculateTotal();

        p1.showBill();
        p2.showBill();
        p3.showBill();


    }
}
