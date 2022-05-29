package Lesson6_Task1;

public class Triangle extends Figure{

    private double a, b, c;

    public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        setPerimeter(a + b + c);
        return getPerimeter();
    }

    @Override
    public double calculateSquare() {
        double halfOfPerimeter = calculatePerimeter()/ 2;
        setSquare(Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c)));
        return getSquare();
    }
}
