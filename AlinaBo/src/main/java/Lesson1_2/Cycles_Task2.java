package Lesson1_2;

public class Cycles_Task2 {
    public static void main (String[] args) {
        int a = -6;
        int b = 6;
        int h = 2;

        for (int i = a; i <= b; i = i + h) {
            if (i <= 2) {
                System.out.println(-i);
            } else System.out.println(i);
        }

    }
}
