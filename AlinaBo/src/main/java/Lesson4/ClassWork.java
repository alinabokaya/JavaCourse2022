package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class ClassWork {
    // Нахождение суммы на главной диагонали
    public static void main(String[] args) {
        // генерация квадратного массива
        System.out.println("Введите размерность массива N");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random random = new Random(); // создаём объект типа Random
        int n = 0; //объявление переменных
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;


        if (sc.hasNextInt()) {
            n = sc.nextInt(); // вводим n с клавиатуры
        }
        int[][] array = new int[n][n]; //инициализация массива размером NxN
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

        for (int i = 0; i < array.length; i++) {
            diagonalSum1 = diagonalSum1 + array[i][i];
        }
        System.out.println("Сумма элементов главной диагонали матрицы: " + diagonalSum1);

        for (int i = array.length-1; i >= 0; i--) {
            diagonalSum2 = diagonalSum2 + array[i][array.length-1 - i];
        }
        System.out.println("Сумма элементов побочной диагонали матрицы: " + diagonalSum2);



//        first(array);
//        second(array);
//        third(array);
    }

}
