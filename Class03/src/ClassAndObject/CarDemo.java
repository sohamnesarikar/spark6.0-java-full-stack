class Car{
    String brand;
    String color;
    double price;
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "Toyota";
        c1.color = "white";
        c1.price = 5033000.23;

        System.out.println("Brand: "+ c1.brand);
        System.out.println("Color: "+ c1.color);
        System.out.println("Price: "+ c1.price);

        c2.brand = "Renault";
        c2.color = "light orange";
        c2.price = 8056839.23;

        System.out.println("---------------------");

        System.out.println("Brand: "+ c2.brand);
        System.out.println("Color: "+ c2.color);
        System.out.println("Price: "+ c2.price);
    }
}
