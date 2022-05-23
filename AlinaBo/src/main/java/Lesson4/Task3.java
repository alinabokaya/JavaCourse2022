package Lesson4;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
//    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//    случайными числами в диапазоне от 0 до 50. И выводим на консоль (в виде матрицы).

//    Проверить произведение элементов какой диагонали больше.

    public static void main(String[] args) {
        // генерация квадратного массива
        System.out.println("Введите размерность массива N");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random random = new Random(); // создаём объект типа Random
        int n = 0; //объявление переменных
        BigInteger multiplyDiagonalMain = BigInteger.ONE;
        BigInteger multiplyDiagonalSide = BigInteger.ONE;


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

        for (int i = 0; i < array.length; i++) {
            multiplyDiagonalMain = multiplyDiagonalMain.multiply(BigInteger.valueOf(array[i][i]));
        }
        System.out.println("Произведение элементов главной диагонали матрицы: " + multiplyDiagonalMain);

        for (int i = array.length - 1; i >= 0; i--) {
            multiplyDiagonalSide = multiplyDiagonalSide.multiply(BigInteger.valueOf(array[i][array.length - 1 - i]));
        }
        System.out.println("Произведение элементов побочной диагонали матрицы: " + multiplyDiagonalSide);

        // Проверить элементов произведения какой из диагоналей больше

        switch (multiplyDiagonalMain.compareTo(multiplyDiagonalSide)) {
            case 0:
                System.out.println("Произведения диагоналей равны!");
                break;
            case 1:
                System.out.println("Произведение элементов главной диагонали больше!");
                break;
            case -1:
                System.out.println("Произведение элементов побочной диагонали больше!");
                break;
        }
    }
}
