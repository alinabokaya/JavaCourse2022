package Lesson1_2;

import java.util.Scanner;

public class Task3_Program {
    static public void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        System.out.println("Enter y: ");
        y = scanner.nextInt();

        if (y <= 4 && y >= -3 && x <= 4 && x >= -4) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
