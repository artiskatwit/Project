package pa4;

public class Main {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(5, 10, 5, 7, 8);
        GeometricShape square = new Square(4);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}