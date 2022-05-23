package Lesson1_2;

import java.math.BigInteger;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        number4();
        cycle8();
    }


    // a = 123 -> 12 -> 1 -> 0
    // b = 345 ->
    // 3
    public static void cycle8() {
        Scanner sc = new Scanner(System.in);// 0 1 2 3 4 5 6 7 8 9
        System.out.println("Вводим число а:");
        int a = sc.nextInt();// 555 - 55
        System.out.println("Вводим число b:");
        int b = sc.nextInt();
        int[] arr = new int[10]; // 0 1 1 1 0 3 0 0 0 0 --- arr

        while (a != 0) {
            arr[a % 10]++; // arr[1] = arr[1] + 1;
            a /= 10;
        }
        // b = 345 -> 34 -> 3
        // b % 10 = 345 % 10 = 5
        // 345 % 10 = 5
        while (b != 0) {
            if (arr[b % 10] != 0) {// arr[5] != 0
                System.out.print(b % 10 + " ");
            }
            b /= 10; // b = b / 10;   b = 345 / 10
        }
    }

    public static void cycle5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводим число:");
        double e = sc.nextDouble(); // 2
        System.out.println("Число цифр в числовом ряду:");// 5
        double n = sc.nextDouble();
        double sum = 0.0;// 2
        for (int i = 0; i <= n; i++) {
            double an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i); // 2, 0.8, 0.5, 0.2
            if (Math.abs(an) >= e) {
                sum += an;
            }
        }
        System.out.println(" Сумма :" + sum);
    }

    public static void cycle2() { // [-3, -2, -1, 0, 1, 2, 3, 4]
        Scanner sc = new Scanner(System.in);
        System.out.println("Отрезок от:");
        int a = sc.nextInt();// -3
        System.out.println("Отрезок до:");
        int b = sc.nextInt();// 4
        System.out.println("С шагом:");
        int h = sc.nextInt();// 1
        int y;
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.println(y);
        }

    }

    public static void cycle7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задаем промежуток от(m):");
        int m = sc.nextInt();// 3
        System.out.println("Задаем промежуток до (n):");
        int n = sc.nextInt();// 9

        for (int i = m; i <= n; i++) {// 3 4 5 6 7 8 9
            System.out.println("Делители числа: " + i);
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void cycle6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("От числа а:");
        int a = sc.nextByte();
        System.out.println("До числа b:");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + (char) i);
        }
        System.out.println();
    }

    public static void cycle4() {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Произведений квадратов первых 200 чисел:" + s);
    }

    public static void cycle3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (int) Math.pow(i, 2);
        }
        System.out.println(" Сумма квадратов первых 100 чисел равна:" + sum);
    }

    public static void cycle1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводим число а:");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел в отрезке от 1 до а:" + sum);
    }

    public static void number5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число Т:");
        int num = sc.nextInt();
        int h = num / 3600;
        int rem = num - (h * 3600);
        int min = rem / 60;
        int sec = rem - (min * 60);
        System.out.println(h + "ч" + min + "мин" + sec + "c");


    }

    public static void number4() {
        double number = 123.456;
        double result = (number * 1000) % 1000 + (int) number / 1000.0;
        System.out.println("Исходное число:" + number);
        System.out.println("Полученное число:" + result);
    }

    public static void num5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводим число:");
        double x = sc.nextDouble();
        double f1 = 0;
        double f2 = 0;
        if (x <= 3) {
            f1 = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("Результат 1:" + f1);
        } else if (x > 3) {
            f2 = 1 / Math.pow(x, 3) + 6;
            System.out.println("Результат 2:" + f2);
        }
    }

    public static void num4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводим сторону отверстия а:");
        int a = sc.nextInt();
        System.out.println("Вводим сторону отверстия b:");
        int b = sc.nextInt();
        System.out.println("Вводим сторону кирпича x:");
        int x = sc.nextInt();
        System.out.println("Вволим сторону кирпича y:");
        int y = sc.nextInt();
        System.out.println("Вводим сторону кирпича z:");
        int z = sc.nextInt();
        if (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || z <= a && z <= b || z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }

    public static void num3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводим точку А:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Вводим точку В:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Вводим точку С:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки будут распологаться на одной прямой");
        } else {
            System.out.println("Точки не распологаются на одной прямой");
        }


    }

    public static void num2() {
        Scanner sc = new Scanner(System.in);// 4
        System.out.println("Число а:");
        int a = sc.nextInt();
        System.out.println("Число b:");
        int b = sc.nextInt();
        System.out.println("Число c:");
        int c = sc.nextInt();
        System.out.println("Число d:");
        int d = sc.nextInt();
        int minNumber1;
        if (a < b) {
            minNumber1 = a;
        } else {
            minNumber1 = b;
        }
        System.out.println("Минимальное число1:" + minNumber1);
        int minNumber2 = Math.min(c, d);
        System.out.println("Минимальное число 2:" + minNumber2);
        if (minNumber1 < minNumber2) {
            System.out.println("Максимальное число:" + minNumber2);
        } else {
            System.out.println("Максимальное число:" + minNumber1);
        }
    }

    public static void num1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Первый угол:");
        int a = sc.nextInt();
        System.out.println("Второй угол:");
        int b = sc.nextInt();
        if (a + b >= 180) {
            System.out.println("Такого треугольника не существует");
        } else if (a == 90 || b == 90 || 180 - a - b == 90){
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Такой треуголтник существует");
        }
    }
}
