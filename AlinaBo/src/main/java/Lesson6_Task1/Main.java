package Lesson6_Task1;

public class Main {

    public static void main(String[] args) {
        double sumOfPerimeters = 0;

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(10, 20);
        Triangle triangle = new Triangle(4, 6, 12);

        Figure[] array = {circle1, circle2, rectangle1, rectangle2, triangle};

        for (int i = 0; i < array.length; i++) {
            sumOfPerimeters = sumOfPerimeters + array[i].calculatePerimeter();
        }
        System.out.println("Sum of perimeters of all figures = " + sumOfPerimeters);
    }

}
