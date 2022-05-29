package Lesson6_Task1;

public class Circle extends Figure{

    private double r;

    public Circle (double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        setPerimeter(2 * r * Math.PI);
        return getPerimeter();
    }

    @Override
    public double calculateSquare() {
        setSquare(Math.PI * Math.pow(r, 2));
        return getSquare();
    }

}
