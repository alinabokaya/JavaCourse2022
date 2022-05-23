package Lesson1_2;

import java.util.Scanner;

public class Task5_Function {
    public static void main(String[] args) {
        double x, result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        x = scanner.nextDouble();

        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Result is " + result);
    }
}
