package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
//    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//    случайными числами в диапазоне от 0 до 50. И выводим на консоль (в виде матрицы).

// Вывести нечетные элементы находящиеся под главной диагональю (включительно).

    public static void main(String[] args) {
        // генерация квадратного массива
        System.out.println("Введите размерность массива N");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random random = new Random(); // создаём объект типа Random
        int n = 0; //объявление переменных



        if (sc.hasNextInt()) {
            n = sc.nextInt(); // вводим n с клавиатуры
        }
        int[][] array = new int[n][n]; //инициализация массива размером NxN
        for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 50
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < n; i++) {// вывод массива в консоль
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Выводим на консоль нечётные элементы под главной диагональю (диагональ включительно)
        System.out.println("Нечётные элементы под главной диагональю матрицы (диагональ включительно): ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }

    }
}
