package pa4;

abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

// Subclass Triangle
class Triangle extends GeometricShape {
    double base, height, side1, side2, side3;

    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Subclass Square
class Square extends GeometricShape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}


