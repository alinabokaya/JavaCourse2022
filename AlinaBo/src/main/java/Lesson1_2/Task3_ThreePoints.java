package Lesson1_2;

import java.util.Scanner;

public class Task3_ThreePoints {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = scanner.nextDouble();
        System.out.println("Enter y1:");
        y1 = scanner.nextDouble();
        System.out.println("Enter x2:");
        x2 = scanner.nextDouble();
        System.out.println("Enter y2:");
        y2 = scanner.nextDouble();
        System.out.println("Enter x3:");
        x3 = scanner.nextDouble();
        System.out.println("Enter y3:");
        y3 = scanner.nextDouble();

        if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
            System.out.println("3 points are on the same line");
        } else System.out.println("3 points are NOT on the same line");

    }
}
