package Lesson1_2;

import java.util.Scanner;

public class Cycles_Task1 {
    public static void main(String[] args) {
        double x;
        int sum = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter x: ");
        x = scanner.nextDouble();

        if (x % 1 == 0 && x > 0) {
            for (int i = 1; i <= x; i++) {
                sum = sum + i;
            }
            System.out.println("Sum = " + sum);
        } else System.out.println("X should be positive and whole!");
    }
}