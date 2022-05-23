package Lesson1_2;

import java.util.Scanner;

public class Task2_MaxMin {
    public static void main(String[] args) {
        double a, b, c, d;
        double minAB, minCD;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextDouble();
        System.out.println("Enter b:");
        b = scanner.nextDouble();
        System.out.println("Enter c:");
        c = scanner.nextDouble();
        System.out.println("Enter d:");
        d = scanner.nextDouble();

        if (a < b) {
            minAB = a;
        } else {
            minAB = b;
        }
        System.out.println("Min between a and b = " + minAB);

        if (c < d) {
            minCD = c;
        } else {
            minCD = d;
        }
        System.out.println("Min between c and d = " + minCD);

        if (minAB > minCD) {
            System.out.println("Max value = " + minAB);
        } else System.out.println("Max value = " + minCD);
    }
}
