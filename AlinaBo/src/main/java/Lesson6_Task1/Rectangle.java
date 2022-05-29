package Lesson6_Task1;

public class Rectangle extends Figure {

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        setPerimeter(2 * a + 2 * b);
        return getPerimeter();
    }

    @Override
    public double calculateSquare() {
        setSquare(a * b);
        return getSquare();
    }
}
