package Lesson1_2;

public class Task4_Brick {
    public static void main(String[] args) {
        double a = 10, b = 20, x = 10, y = 30, z = 20;

        if (x <= a && y <= b || y <= a && x <= b) {
            System.out.println("Will fit in by XY");
        } else if (x <= a && z <= b || z <= a && x <= b) {
            System.out.println("Will fit in by XZ");
        } else if (z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Will fit in by ZY");
        } else System.out.println("Will NOT fit in");
    }
}
