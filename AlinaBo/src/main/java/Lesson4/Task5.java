package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
//    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//    случайными числами в диапазоне от 0 до 50. И выводим на консоль (в виде матрицы).

//    Транспонировать матрицу (1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и тд.)


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
        System.out.println("\nИзначальный массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Транспонируем матрицу (1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и тд.)
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tempValue = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tempValue;
            }
        }
        // вывод нового массива в консоль
        System.out.println("\nНовый массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

