package Lesson6_Task1;

public abstract class Figure {

    private double perimeter;
    private double square;

    public abstract double calculatePerimeter ();
    public abstract double calculateSquare ();


    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
