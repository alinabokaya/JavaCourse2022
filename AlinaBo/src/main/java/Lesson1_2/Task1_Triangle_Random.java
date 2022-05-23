package Lesson1_2;

public class Task1_Triangle_Random {
    public static void main(String[] args) {
        double a, b, c;

        a = Math.floor(Math.random() * 360) + 1;
        System.out.println("a = " + a);
        b = Math.floor(Math.random() * 360) + 1;
        System.out.println("b = " + b);
        c = 180 - (a + b);

        if (a + b < 180) {
            System.out.println("Triangle exists");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Triangle is right triangle");
            }
        }   else System.out.println("Triangle doesn't exist");
    }
}
