package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class ClassWork2 {
    // Вывести на экран все нечетные строки у которых 1-ый элемент больлше последнего

    public static void main(String[] args) {
        // генерация квадратного массива
        System.out.println("Введите размерность массива N");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random random = new Random(); // создаём объект типа Random
        int n = 0; //объявление переменных
        if (sc.hasNextInt()) {
            n = sc.nextInt(); // вводим n с клавиатуры
        }
        int[][] array = new int[n][n]; //инициализация массива размером NxM
        for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 9
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(9);
            }
        }
        for (int i = 0; i < n; i++) {// вывод массива в консоль
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вывод");
        for (int i = 1; i < n; i = i + 2) {
            for (int j = 0; j < n; j++) {
                if (array[i][0] > array[i][array.length - 1]) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }

}
