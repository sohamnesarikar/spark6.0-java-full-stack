public class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.width = 6;

        System.out.println("Area of rectangle: " + r.calculateArea());
        System.out.println("Perimeter of rectangle: " + r.calculatePerimeter());
    }
}
