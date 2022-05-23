package Lesson1_2;

import java.util.Scanner;

public class Cycles_Task5 {
    public static void main(String[] args) {
        double e;
        double sum = 0;
        double an;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter e: ");
        e = scanner.nextDouble();

        for (int i = -6; i <= 6; i++) {
            an = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(an) >= e) {
                sum = sum + an;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
