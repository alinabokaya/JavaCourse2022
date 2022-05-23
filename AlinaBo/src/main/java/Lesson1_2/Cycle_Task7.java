package Lesson1_2;

import java.util.Scanner;

public class Cycle_Task7 {
    public static void main(String[] args) {
        int m, n;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m: ");
        m = scanner.nextInt();
        System.out.println("Enter n: ");
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            if (i > 0) {
                System.out.println("Делители числа " + i + " --> ");
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 && j != i) {
                        System.out.println(j + " ");
                    }
                }
            }
        }
    }
}
