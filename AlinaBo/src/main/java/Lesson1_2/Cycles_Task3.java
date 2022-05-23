package Lesson1_2;

public class Cycles_Task3 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + Math.pow(i, 2);
        }
        System.out.println("Sum of 1st 100 numbers is: " + sum);
    }
}
