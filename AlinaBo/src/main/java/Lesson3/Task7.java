package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
//    Найти среднее арифметическое элементов с нечетными индексами.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаём объект типа Scanner
        Random random = new Random(); // Создаём объект типа Random
        System.out.println("Длина массива: ");
        int n = sc.nextInt();// Вводим длину массива с клавиатуры
        double sumArray = 0;
        double averageSumArray;
        double oddCount = 0;


        Integer[] array = new Integer[n]; // Cоздаём одномерный массив длиной = n

        // Наполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30); // заполняем массив случайными числами от 0 до 30
        }

        // Выводим массив на экран
        System.out.print("Массив без изменений: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Считаем среднее арифметическое элементов массива с нечетными индексами и кол-во таких элементов
        for (int i = 1; i < array.length; i = i + 2) {
            sumArray = sumArray + array[i];
            oddCount++;
        }
        System.out.println("\nСумма элементов с нечетным индексом: " + sumArray);
        averageSumArray = sumArray / oddCount;
        System.out.println("Срeднее арифметическое таких элементов: " + averageSumArray);

    }
}
