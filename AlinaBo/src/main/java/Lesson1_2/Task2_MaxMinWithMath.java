package Lesson1_2;

import java.util.Scanner;

public class Task2_MaxMinWithMath {
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

        minAB = Math.min(a,b);
        System.out.println("Min between a and b = " + minAB);
        minCD = Math.min(c,d);
        System.out.println("Min between c and d = " + minCD);
        System.out.println("Max value = " + Math.max(minAB,minCD));
    }
}
