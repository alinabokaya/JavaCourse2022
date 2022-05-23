package Lesson1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesha1 {
    public static void main(String[] args) {
        String a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.next();
        System.out.println("Enter b: ");
        b = scanner.next();
        char[] charsA = a.toCharArray();
        List<Character> res = new ArrayList<>();
        for (char c : charsA) {
            int temp = b.indexOf(c);

            if (b.indexOf(c) >= 0 && !res.contains(c)) {
                res.add(c);
            }
        }
        System.out.println(res);
    }
}
// 120 933042

