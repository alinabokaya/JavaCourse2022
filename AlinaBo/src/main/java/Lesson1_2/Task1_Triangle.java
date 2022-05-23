package Lesson1_2;

import java.util.Scanner;

public class Task1_Triangle {
    public static void main(String[] args) {
        double a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle angle a:");
        a = scanner.nextDouble();
        System.out.println("Enter triangle angle b:");
        b = scanner.nextDouble();
        c = 180 - (a + b);

        if (a + b < 180) {
            System.out.println("Triangle exists");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Triangle is right triangle");
            }
        }   else System.out.println("Triangle doesn't exist");
    }
}
