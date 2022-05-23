package Lesson1_2;

import java.util.Scanner;

public class Lesha2 {
    public static void main(String[] args) {
        String a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.next();
        System.out.println("Enter b: ");
        b = scanner.next();

        char[] charsA = a.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char element : charsA) {
            if (b.indexOf(element) >= 0 && result.toString().indexOf(element) < 0) {
                result.append(element).append(" ");
            }
        }
        System.out.println(result);
    }
}
