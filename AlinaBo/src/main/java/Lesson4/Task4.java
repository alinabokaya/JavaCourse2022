package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
//    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//    случайными числами в диапазоне от 0 до 50. И выводим на консоль (в виде матрицы).

// Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)

    public static void main(String[] args) {
        // генерация квадратного массива
        System.out.println("Введите размерность массива N");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random random = new Random(); // создаём объект типа Random
        int n = 0; //объявление переменной размерности массива
        int sumDiagonalSide = 0;

        if (sc.hasNextInt()) {
            n = sc.nextInt(); // вводим n с клавиатуры
        }
        int[][] array = new int[n][n]; //инициализация массива размером NxN
        //Заполнение массива случайными числами от 0 до 50
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        // вывод массива в консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Выводим на консоль сумму чётных элементов над побочной диагональю (диагональ НЕ включительно)
        //System.out.println("Сумма");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[i][j] % 2 == 0) {
                    sumDiagonalSide = sumDiagonalSide + array[i][j];
                }
            }
        }
        System.out.print("Сумма чётных элементов над побочной диагональю (диагональ НЕ включительно) = " + sumDiagonalSide);
    }
}
